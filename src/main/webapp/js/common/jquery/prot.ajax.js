/**
 * jQueryが用意している非同期通信を行うjsファイル.
 */

var ajax = function() {
	// type指定(POST, GET)
	this.type;
	// 非同期通信をするURL
	this.url;
	// 送信するデータ
	this.data;
	// 受信するデータタイプ
	this.dataType;
	// 送信前に処理を行うオプション
	this.beforeSend;
}

ajax.prototype = {
	
	// 各フィールドに値をセット
	setOption: function(option) {
		this.type       = option.type;
		this.url        = option.url;
		this.data       = option.data;
		this.dataType   = option.dataType;
		this.beforeSend = option.beforeSend ? option.beforeSend : () => {};
		return this;
	},
	
	// 非同期通信の実行
	execute: function() {
		return new Promise((resolve, reject) => {
			$.ajax({
				type:       this.type,
				url:        this.url,
				data:       this.data,
				dataType:   this.dataType,
				beforeSend: this.beforeSend,
				statusCode: {
					404: function() {
						console.err("404 Not Found.");
					}
				}
			})
			// 通信が成功した際に走るメソッド
			.done((response, textStatus, jqXHR) => {
				resolve(response);
			})
			// 通信が失敗した際に走るメソッド
			.fail((jqXHR, textStatus, errorThrown) => {
				reject(errorThrown);
			});
		});
	}
}

var mcpAjax = new ajax();
