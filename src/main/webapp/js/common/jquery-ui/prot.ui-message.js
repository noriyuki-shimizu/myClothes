/**
 * jquery uiでのメッセージ表示
 */

var uiMessage = function() {
	// メッセージ以外の要素
	this.subMsgElement = '<span></span><input type="button" value="×" class="close-msg-button">';
	//
	this.$uiWidgetMsg = $('.ui-widget-msg');
	//
	this.$viewMessage = $(".view-message");
	// メッセージ
	this.message = null;
}

uiMessage.prototype = {
	
		resetOption: function() {
			uiMessage.call(this);
		},
		
		/** 
		 * メッセージのセット
		 */
		setMessage: function(message) {
			if(typeof message !== 'string') {
				throw new TypeError('メッセージは文字列にしてください。');
			}
			this.message = message;
			return this;
		},
		
		/**
		 * メッセージ表示
		 */
		viewMessage: function() {
			this.$uiWidgetMsg.css("display", "");
			return this;
		},
		
		/**
		 * メッセージ表示箇所をクリーンする
		 */
		messageClear: function() {
			this.$viewMessage.empty();
			this.$viewMessage.append(this.subMsgElement);
			return this;
		},
		
		/**
		 * closeボタン押下時など、メッセージを閉じる
		 */
		closeMessage: async function() {
			return this.$uiWidgetMsg.css("display", "none");
		},
		
		/**
		 * エラー表示
		 */
		displayError: function() {
		    var $msgBar = this.$uiWidgetMsg.children();
		    
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
			var $msgBar = this.$uiWidgetMsg.children();
		    
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