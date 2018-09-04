/**
 * jquery uiでのメッセージ表示
 */

var uiMessage = function() {
	// メッセージ以外の要素
	this.subMsgElement = '<span></span><input type="button" value="×" class="close-msg-button">';
	// メッセージ
	this.message;
}

uiMessage.prototype = {
	
		/** 
		 * メッセージのセット
		 */
		setMessage: function(message) {
			this.message = message;
			return this;
		},
		
		/**
		 * メッセージ表示
		 */
		viewMessage: function() {
			$(".ui-widget-msg").css("display", "");
			return this;
		},
		
		/**
		 * メッセージ表示箇所をクリーンする
		 */
		messageClear: function() {
			$(".view-message").empty();
			$(".view-message").append(this.subMsgElement);
			return this;
		},
		
		/**
		 * closeボタン押下時など、メッセージを閉じる
		 */
		closeMessage: async function() {
			return $(".ui-widget-msg").css("display", "none");
		},
		
		/**
		 * エラー表示
		 */
		displayError: function() {
		    var $msgBar = $(".ui-widget-msg").children();
		    
		    $msgBar
		    	.find("p.view-message")
		        .append(this.message);
		    $msgBar
		    	.find("span")
		    	.removeClass();
		    $msgBar
			    .find("span")
			    .addClass("ui-icon ui-icon-alert");
		    $msgBar.removeClass();
		    
		    $msgBar.delay(10).queue(function() {
		        $(this).addClass('ui-state-error ui-corner-all').dequeue();
		    });
		},

		/**
		 * 警告表示
		 */
		displayWarning: function() {
			var $msgBar = $(".ui-widget-msg").children();
		    
		    $msgBar
		    	.find("p.view-message")
		        .append(this.message);
		    $msgBar
		    	.find("span")
		    	.removeClass();
		    $msgBar
		    	.find("span")
		    	.addClass("ui-icon ui-icon-info");
		    $msgBar.removeClass();
		    
		    $msgBar.delay(10).queue(function() {
		        $(this).addClass('ui-state-highlight ui-corner-all').dequeue();
		    });
		}
}

var mcpMessage = new uiMessage();