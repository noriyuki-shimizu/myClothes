/**
 * jQueryが用意している非同期通信を行うjsファイル.
 */

var Ajax = {
	create: function() {
		var ajax = Object.create(Ajax.prototype);
		
		ajax.o = Object.freeze({type: 'Ajax'});
		
		// type指定(POST, GET)
		ajax.type = null;
		// 非同期通信をするURL
		ajax.url = null;
		// 送信するデータ
		ajax.data = null;
		// 受信するデータタイプ
		ajax.dataType = null;
		// 送信前に処理を行うオプション
		ajax.beforeSend = null;
		
		return ajax;
	},

	prototype: {
		getType: function() {
			return this.o.type;
		},
		
		resetOption: function() {
			this.type = null;
			this.url = null;
			this.data = null;
			this.dataType = null;
			this.beforeSend = null;
		},
			
		// 各フィールドに値をセット
		setOption: function(option) {
			
			// 引数チェック
			if(arguments.length !== 1) {
				throw new Error('引数の数は1つです。');
			}
			
			this.type       = option.type;
			this.url        = option.url;
			this.data       = option.data;
			this.dataType   = option.dataType;
			this.beforeSend = option.beforeSend ? option.beforeSend : () => {};
			
			return this;
		},
		// 非同期通信の実行
		execute: async function() {
			
			return $.ajax({
				type:       this.type,
				url:        this.url,
				data:       this.data,
				dataType:   this.dataType,
				beforeSend: this.beforeSend,
				statusCode: {
					404: function() {
						console.err('404 Not Found.');
					}
				}
			})
			// 通信が成功した際に走るメソッド
			.done((response, textStatus, jqXHR) => {
				return response;
			})
			// 通信が失敗した際に走るメソッド
			.fail((jqXHR, textStatus, errorThrown) => {
				throw new Error(errorThrown);
			});
			
		}
	}
};

var mcpAjax = Ajax.create();
