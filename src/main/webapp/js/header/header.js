/**
 * ヘッダーに関するjsファイル.
 */

$(function() {

	// 共通のjQueryイベントをセットする
	commonEventSet();
	
	getContext().then(contextPath => {
		// メニュー、画面情報を取得
		getScreen(contextPath);
	});
	
});

function commonEventSet() {
	// スマートメニュー実行
	$("#main-menu").smartmenus();

	// リンク無効
	$(".notLink").click(() => {
		return false;
	});
	
	// error/infoのメッセージにおいて、closeボタン押下時のイベント
	$(document).on("click", ".close-msg-button", function() {
		mcpMessage
			.messageClear()
			.closeMessage();
	});
	
}

async function getContext() {
	var r = document.cookie.split(';');

	var contextPathKey = 'contextPath';
    var contextPathValue;
    
	await r.pForEach(value => {
	    //cookie名と値に分ける
	    var content = value.split('=');
	    
	    if(contextPathKey === content[0]) {
	    	contextPathValue = decodeURIComponent(content[1]);
	    }
	});
	
	return contextPathValue;
}

async function getScreen(contextPath) {
	
	return mcpAjax.setOption({
		type: "GET",
		url: contextPath + "/MenuInfo/getMenu",
		data: {},
		dataType: "json" 
	})
	// 非同期処理実行
	.execute().then(v => {
		console.log(v);
	});
}
