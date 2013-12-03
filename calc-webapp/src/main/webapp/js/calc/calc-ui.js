function UI() {
	
	
};


UI.messageContainer = $("#messageContainer");
UI.messageContainerClosBtn = UI.messageContainer.find(".close");

UI.messageContainerClosBtn.click(function(e){	
	UI.messageContainer.fadeOut( 800 );
});

/**
 * Shows application error message
 */
UI.showError = function(message, hide){
	// Add div if not defined
	
	UI.messageContainer.removeClass("alert-success");
	UI.messageContainer.addClass("alert-danger");		
	
	UI.messageContainer.find("span").html( message );
	
	UI.messageContainer.fadeIn( 400 );
	
	// fade out after 2 seconds
	if(hide == true) {
		UI.messageContainer.delay( 2000 ).fadeOut( 800 );
	}
};	
/**
 * Shows application success  message
 */
UI.showSuccess = function(message, hide){
	// Add div if not defined
	
	UI.messageContainer.removeClass("alert-danger");		
	UI.messageContainer.addClass("alert-success");
	
	UI.messageContainer.find("span").html( message );
	
	UI.messageContainer.fadeIn( 400 );
	
	// fade out after 2 seconds
	if(hide == true) {
		UI.messageContainer.delay( 2000 ).fadeOut( 800 );
	}
};	
/**
 * Shows a modal with static backdrop to avoid user interaction
 */
UI.lock = function() {
	$uiLockModal = $("#ui-lock-modal");
	$uiLockModal.modal({keyboard:false, backdrop:"static"});
	$('body').addClass('locked');
};

/**
 * Remove the lock modal
 */
UI.unlock = function() {
	$uiLockModal.modal('hide');
	$uiLockModal.modal('removeBackdrop');
	$('body').removeClass('locked');
};

/**
 * Reset a progress bar to its original state
 */
UI.resetProgressBar = function($progressBar) {
	$progressBar.removeClass();
	$progressBar.addClass("progress-bar");
	$progressBar.parent().removeClass();
	$progressBar.parent().addClass("progress");
};

UI._enabledElements = null;
/**
 * Disable all enabled elements and keep a reference to them
 */
UI.disableAll = function() {
	UI._enabledElements = $(document).find(":enabled");
	UI.disable(UI._enabledElements);	
};
/**
 * Enable all ui elements that were previously enabled but now disabled after calling disableAll 
 */
UI.enableAll = function() {
	if(UI._enabledElements){
		UI.enable(UI._enabledElements);
	}
};
/**
* Disable a component like buttons
*/
UI.disable = function(component) {
	component.prop('disabled', true);
};
/**
* Enable a component like buttons
*/
UI.enable = function(component) {
	component.prop('disabled', false);
};

/**
 * Opens a confirm dialog.
 * The dialog will appear in the fixed position specified or it will be horizontally and vertically centered. 
 * 
 * @param message
 * @param yesHandler
 * @param noHandler (optional)
 * @param position (optional) object with top, left, right, bottom numeric values.
 */
UI.showConfirm = function(message, yesHandler, noHandler, position) {
	var template = 
		'<div id="confirm-dialog" class="dialog">' +
			'<div class="content"></div>' +
			'<div class="footer">' +
				'<button type="button" class="btn btn-default yes">Yes</button>' +
				'<button type="button" class="btn btn-default no" data-dismiss="modal">No</button>' +
			'</div>' +
		'</div>';
	 var dialog = $(template);
	 dialog.find(".content").text(message);
	 var $yesBtn = dialog.find(".yes");
	 $yesBtn.off("click");
	 $yesBtn.click(function(event){
		 dialog.remove();
		 if ( yesHandler) {
			 yesHandler();
		 }
	 });
	 var $noBtn = dialog.find(".no");
	 $noBtn.off("click");
	 $noBtn.click(function(event){
	 	dialog.remove();
		 if ( noHandler) {
			 noHandler();
		 }
	 });
	 dialog.css({
		 position: "fixed"
	 });
	 
	 if ( position ) {
		 dialog.css({
			top: position.top,
			left: position.left,
			right: position.right,
			bottom: position.bottom
		 });
	 } else {
		 dialog.css({
		 	top: "30%",
		 	left: "50%"
		 });
	 }
	 $("body").append(dialog);
 };