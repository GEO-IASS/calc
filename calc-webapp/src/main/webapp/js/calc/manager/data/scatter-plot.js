/**
 * @author Mino Togna 
 */

function ScatterPlot(container) {
	// ui container
	this.container = container;
	
	
	
	// options section
	var optionsSection = this.container.find('.options');
	
	this.xCombo = optionsSection.find('[name=x]').combobox();
	this.yCombo = optionsSection.find('[name=y]').combobox();
	
	this.refreshBtn = optionsSection.find('[name=refresh]');
	//chart container
	this.chartContainer = this.container.find(".chart");
	this.chart = null;
	
	this.job = null;
	this.entityId = null;
	this.variables = [];
	
	this.xVariable = null,
	this.yVariable = null,
	this.offset = 0;
//	this.started = false;
	
	//event handlers
	//change x and y variables
	this.xCombo.change( $.proxy(
			function(e) {
					e.preventDefault();
					this.xVariable = this.xCombo.val();
				} 
			, this ));
	this.yCombo.change( $.proxy(
			function(e){
					e.preventDefault();
					this.yVariable = this.yCombo.val();
				} 
			, this ));
	
	//refresh chart button
	this.refreshBtn.click( $.proxy(
			function(e){
				if( this.xVariable == null || this.yVariable == null ){
					UI.showError( "x and y must be set", true );
				} else {
					this.refresh();
				}
			} 
		, this ));
			
	
	this.chartinfo = {
		    chart: {
		    	renderTo: this.chartContainer.attr("id"),
		    	type: 'scatter',
                zoomType: 'xy',
                borderWidth: 0,
                borderRadius: 0,
                backgroundColor: null,
		    },
		    credits: {
		    	enabled:false
	    	},
		    title: {
		        text: '',
		        style: {
		        	color: '#496d7e',
		        	font: '1.2em Trebuchet MS, Verdana, sans-serif'
		        }
		    },
		    xAxis: {
                title: {
                    enabled: true,
                    text: '',
    		        style: {
    		        	color: '#496d7e',
    		        	font: '1.4em Trebuchet MS, Verdana, sans-serif'
    		        }
                },
                lineWidth: 1,
                lineColor: "#ecf0f1",
                gridLineColor: "#ecf0f1",
                tickColor: "#ecf0f1",
                labels: {
                    style: {
                       color: '#ecf0f1',
                       font: '0.9em Trebuchet MS, Verdana, sans-serif'
                    }
                 }
//                startOnTick: true,
//                endOnTick: true,
//                showLastLabel: true
            },
            yAxis: {
                title: {
                    text: '',
    		        style: {
    		        	color: '#496d7e',
    		        	font: '1.4em Trebuchet MS, Verdana, sans-serif'
    		        }
                }
            ,
//                lineWidth: 1,
//                lineColor: "#ecf0f1"
            	gridLineColor: "#ecf0f1",
            	labels: {
                    style: {
                       color: '#ecf0f1',
                       font: '0.9em Trebuchet MS, Verdana, sans-serif'
                    }
                 }
            },
            legend: {
                layout: 'vertical',
                align: 'left',
                verticalAlign: 'top',
                x: 100,
                y: 70,
                floating: true,
                backgroundColor: '#FFFFFF',
                borderWidth: 1
            },
            plotOptions: {
                scatter: {
                	color:"ecf0f1",
                    marker: {
                        radius: 5,
                        states: {
                            hover: {
                                enabled: true,
                                lineColor: 'rgb(100,100,100)'
                            }
                        }
                    },
                    states: {
                        hover: {
                            marker: {
                                enabled: false
                            }
                        }
                    },
                    tooltip: {
//                        headerFormat: '<b>{series.name}</b><br>',
                        pointFormat: '{point.x} , {point.y}'
                    }
                }
            },
            series: [{
                name: '',
                color: 'rgba(108, 159, 183, .5)',
                data: []
            }]
		};
	
	this.workspaceManager = WorkspaceManager.getInstance();
};

ScatterPlot.prototype = (function(){
	var updateJob = function(job) {
		if( this.job.id == job.id ){
			this.job = job;
		}
	};
	
	var setJob = function(job) {
		var $this = this;
		
		$this.job = job;
		//reset chart
		if(this.offset != 0) {
//			console.log("reset chart from set job");
//			console.log ($("#"+this.chartContainer.attr("id")).attr("id") );
			this.chart.destroy();
		}
		//reset instance variables 
		$this.xVariable = null,
		$this.yVariable = null,
		$this.offset = 0;
		
		$this.entityId = $this.job.tasks[0].calculationStep.outputEntityId;
		
		$this.workspaceManager.activeWorkspace(function(ws) {
			var entity = ws.getEntityById($this.entityId);
			$this.variables = entity.quantitativeVariables;
			
			$this.xCombo.data($this.variables, 'name', 'name');
			$this.yCombo.data($this.variables, 'name', 'name');
		});
		
		//set vars
		var vars = $this.job.tasks[0].calculationStep.variables;
		if(vars.length == 2) {
			$this.xVariable = vars[0];
			$this.yVariable = vars[1];
			
			$this.xCombo.val($this.xVariable);
			$this.yCombo.val($this.yVariable);
		}
	};
	
	var refresh = function() {
		$this = this;
		
		if( this.xVariable != null && this.yVariable != null ) {
			
			//reset chart ?!
			if(this.offset != 0) {
//				console.log("reset chart from refresh");
//				console.log ($("#"+this.chartContainer.attr("id")).attr("id") );
//				this.chart.destroy();
				this.offset = 0;
			}
			
			var vars = [$this.xVariable, $this.yVariable];
//			console.log(vars);
			//start getting data for the job
			$.ajax({
				url:"rest/data/"+$this.entityId+"/query.json",
				dataType:"json",
				data:{	offset:$this.offset, 
						fields:vars.join(), 
						excludeNull:true
					},
				
				success: $.proxy( function(response) {
					var $this = this;
					var data = response;
					this.chartinfo.xAxis.title.text = this.xVariable;
					this.chartinfo.yAxis.title.text = this.yVariable;
					
					this.chart = new Highcharts.Chart(this.chartinfo);

//					console.log(response);
					
					// prepare chart data
					var chartData = [];
					$.each(data,function(i,record){
//						console.log(record);
						var seriesItem = [] ;
//						console.log(record)
						$.each(record.fields, function(i,field) {
//							console.log(field);
							seriesItem.push(field);
						});
						var shift = ($this.chart.series.data) ? $this.chart.series.data.length > 20 : 0;
						var t = 50;
//						setTimeout(function(){
							$this.chart.series[0].addPoint(seriesItem, false);							
//						}, (t++));   
						if($this.chart.series[0].data.length % 500 ==0){
							$this.chart.redraw();
						}
//						chartData.push(seriesItem);
					});
					$this.chart.redraw();
					
					this.offset = chartData.length;
					// show chart
					
//					console.log(chartData);
//					this.chartinfo.series[0].data = chartData;
					//update offset
					
//					this.chart = this.chartContainer.highcharts(this.chartinfo);
//					console.log( this.chart.redraw() );
					
				} , this)
				
			});	
		}
		
	};
	
	return {
		constructor : ScatterPlot,
		
		setJob : setJob,
		
		updateJob : updateJob,
		
		show : function() {
			if ( this.offset == 0 ) {
				this.refresh();
			}
			this.container.fadeIn();
		},
		
		hide : function(){
			this.container.hide();
		},
		
		refresh : refresh
		
	};
})();
