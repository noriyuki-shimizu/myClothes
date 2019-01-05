/**
 * jquery uiでのメッセージ表示
 */

var UiMessage = {
		create: function() {
			var uiMessage = Object.create(UiMessage.prototype);
			
			uiMessage.o = Object.freeze({type: 'UiMessage'});
			
			uiMessage.$elem = Object.freeze({
				// メッセージ以外の要素
				subMsgElement : '<span></span><input type="button" value="×" class="close-msg-button">',
				//
				$uiWidgetMsg : $('.ui-widget-msg'),
				//
				$viewMessage : $('.view-message')
			});
			// メッセージ
			uiMessage.message = null;
			
			return uiMessage;
		},
		prototype: {
			
			resetOption: function() {
				this.message = null;
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
				this.$elem.$uiWidgetMsg.css('display', '');
				return this;
			},
			
			/**
			 * メッセージ表示箇所をクリーンする
			 */
			messageClear: function() {
				this.$elem.$viewMessage.empty();
				this.$elem.$viewMessage.append(this.$elem.subMsgElement);
				return this;
			},
			
			/**
			 * closeボタン押下時など、メッセージを閉じる
			 */
			closeMessage: async function() {
				return this.$elem.$uiWidgetMsg.css('display', 'none');
			},
			
			/**
			 * エラー表示
			 */
			displayError: function() {
			    var $msgBar = this.$elem.$uiWidgetMsg.children();
			    
			    const viewMessage  = 'p.view-message';
				const span         = 'span';
				const uiIconAlert  = 'ui-icon ui-icon-alert';
				const uiStateError = 'ui-state-error ui-corner-all';
				
			    $msgBar
			    	.find(viewMessage)
			        .append(this.message);
			    $msgBar
			    	.find(span)
			    	.removeClass();
			    $msgBar
				    .find(span)
				    .addClass(uiIconAlert);
			    $msgBar.removeClass();
			    
			    $msgBar.delay(10).queue(function() {
			        $(this).addClass(uiStateError).dequeue();
			    });
			},

			/**
			 * 警告表示
			 */
			displayWarning: function() {
				var $msgBar = this.$elem.$uiWidgetMsg.children();
			    
				const viewMessage      = 'p.view-message';
				const span             = 'span';
				const uiIconInfo       = 'ui-icon ui-icon-info';
				const uiStateHighlight = 'ui-state-highlight ui-corner-all';
				
			    $msgBar
			    	.find(viewMessage)
			        .append(this.message);
			    $msgBar
			    	.find(span)
			    	.removeClass();
			    $msgBar
			    	.find(span)
			    	.addClass(uiIconInfo);
			    $msgBar.removeClass();
			    
			    $msgBar.delay(10).queue(function() {
			        $(this).addClass(uiStateHighlight).dequeue();
			    });
			}
		}
}

var mcpMessage;
window.onload = function() {
	mcpMessage = UiMessage.create();
}
