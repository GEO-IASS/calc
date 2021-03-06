/**
 * Equation list manager 
 * @author Mino Togna
 */

EquationListManager = function( container ) {
	this.BASE_URI = "rest/workspace/active/settings/equationList/";
	/* UI components */
	this.container = $( container );
	
	// View section
	this.viewSection	= this.container.find( ".view-section" );
	this.equationLists	= this.viewSection.find( ".equation-lists" );
	this.equationsTable = this.viewSection.find( "table.equations-table" );
	
	// upload section
	this.form 			= this.container.find( ".upload-csv-form-section" );
	
	// import section
	this.importSection	= this.container.find( ".import-section" );
	this.listName		= this.importSection.find( "[name=list-name]" );
	this.filePath		= "";
	this.importBtn		= this.importSection.find( "[name=import-btn]" );
	
	this.init();
};


EquationListManager.prototype.init = function() {
	// reset edit form
	this.selectedListId = null;
	
	var $this = this;
	
	//form file upload manager
	var uploadSuccess = function ( response ) {
		$this.showImport( response.fields.filepath, response.fields.headers );
	};

	this.formFileUpload = new FormFileUpload(this.form, null, uploadSuccess);
	
	// import event handlers
	this.importBtn.click( function(e) {
		e.preventDefault();
		
		var listName = $.trim( $this.listName.val() );
		
		if( listName == "" ) {
			UI.showError( "List name cannot be blank" , true );
		} else {
			var listId = ( $this.selectedList ) ? $this.selectedList.id : null ;
			WorkspaceManager.getInstance().activeWorkspaceImportEquationList( $this.filePath , listName , listId , function(ws) {
				$this.showList();
			} );
		}
		
	});
	
	// show lists
	this.showList();
};

// after file upload show import
EquationListManager.prototype.showImport = function( filepath ) {
	var listName = ( this.selectedList ) ? this.selectedList.name : "" ; 
	this.listName.val( listName );
	this.filePath = filepath ;
	
	this.viewSection.hide();
	this.importSection.fadeIn();
};

/**
 * Update equation lists UI
 */
EquationListManager.prototype.showList = function() {
	// hide equations table
	this.equationsTable.hide();

	this.importSection.hide();
	this.viewSection.show();
	this.equationLists.empty();
	 
	var $this = this;
	WorkspaceManager.getInstance().activeWorkspace( function(ws) {
		$.each( ws.equationLists , function( i , eq ){
			
			var addButton = function( ){
				var div = $( '<div class="row no-margin no-padding width100"></div>')
				div.hide();
				$this.equationLists.append( div );
				
				var btn = $( '<button class="btn option-btn col-md-10"></button>' );
				btn.html( eq.name );
				div.append( btn );
				
				var deleteBtn = $( '<button class="btn no-background col-md-2"><i class="fa fa-minus-square"></i></button>' );
				div.append( deleteBtn );
				deleteBtn.click( function(){

					var position = deleteBtn.offset();
					position.top -= 20; 
					position.left -= 20;
					UI.showConfirm( 
							"Do you want to delete " + eq.name + " equation list? This operation cannot be undone." , 
							function(){
								var params = {
										url		: $this.BASE_URI + eq.id + "/delete.json",
										success	:function(response) {
											
											WorkspaceManager.getInstance().activeWorkspace( function(ws) {
												if( response.status == "OK" ){
													UI.showSuccess( "Equation list deleted" , true );
													ws.equationLists = response.fields.equationLists;
													$this.showList();
												} else {
													UI.showError( response.fields.error , true );
												}
											});
										}
								}
								
								EventBus.dispatch("ajax", null, params);
							} , 
							null,
							position
							)
				});
				
				
				setTimeout( function(){
					div.fadeIn();
				} , i * 75);
				
				
				var optionBtn = new OptionButton( btn );
				
				var select = function( list ) {
					
					// unselect last selection 
					if( $this.selectedListButton ) {
						$this.selectedListButton.deselect();
					}
					
					UI.lock();
					var tbody = $this.equationsTable.find("tbody");
					tbody.empty();
					$this.equationsTable.show();
					
					$.ajax({
						url			: $this.BASE_URI + list.id + "/equations.json" ,
						method		: "GET" ,
						dataType	: "json"
					}).done( function(response) {
						UI.unlock();
						
						var equations = response.fields.equations;
						$.each( equations , function( j , equation) {
							var tr = $( "<tr style='font-size:0.9em'></tr>" );
							tr.hide();
							tbody.append( tr );
							
							var td = $( "<td></td>" );
							td.html( equation.code );
							tr.append( td );
							
							td = $( "<td></td>" );
							td.html( equation.equation );
							tr.append( td );
							
							td = $( "<td></td>" );
							td.html( equation.condition );
							tr.append( td );
							
							setTimeout( function(){
								tr.fadeIn();
							} , j * 75);
							
							$this.selectedListButton = optionBtn;
							$this.selectedList 		= list; 
						});
					}).error(function(){
						Calc.error.apply( this, arguments );
					})
				};
				optionBtn.select( select , eq );
				
				var deselect = function( e ) {
					$this.equationsTable.hide(0);
					
					$this.selectedListButton = null;
					$this.selectedList 	= null;
				};
				optionBtn.deselect( deselect , eq )
			}
			
			addButton();
		});
		
	});
	
};