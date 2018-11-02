/**
 * jQueryが用意している非同期通信を行うjsファイル.
 */

var ajax = function() {
	
	if(!(this typeof ajax)) {
		return new ajax();
	} 
	
	// type指定(POST, GET)
	this.type = null;
	// 非同期通信をするURL
	this.url = null;
	// 送信するデータ
	this.data = null;
	// 受信するデータタイプ
	this.dataType = null;
	// 送信前に処理を行うオプション
	this.beforeSend = null;
}

ajax.prototype = {
	
	resetOption: function() {
		ajax.call(this);
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
	
	isParamCheck : function() {
		// メンバ変数を取得
		var argList = Object.keys(this);

		// メンバ変数に値が設定されているか判定
		return argList.some(arg => {
			return this[arg] === undefined;
		});
	},
	
	// 非同期通信の実行
	execute: async function() {
		
		if(this.isParamCheck()) {
			throw new Error('全てのパラメータに値が設定されていません。');
		}
		
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
			return response;
		})
		// 通信が失敗した際に走るメソッド
		.fail((jqXHR, textStatus, errorThrown) => {
			throw new Error(errorThrown);
		});
	}
}

var mcpAjax = new ajax();
