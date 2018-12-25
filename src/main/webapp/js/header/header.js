/**
 * ヘッダーに関するjsファイル.
 */

$(function() {

	// 共通のjQueryイベントをセットする
	commonEventSet();
	
	// Cookieオブジェクトの作成
	var mcpCookie = _Cookie.create();
	
	mcpCookie.getCookieValue('contextPath').then(contextPath => {
		// メニュー、画面情報を取得
		appendMenuHTML(contextPath);
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

async function appendMenuHTML(contextPath) {
	
	return mcpAjax.setOption({
		type: "GET",
		url: contextPath + "/MenuInfo/getMenu",
		data: {},
		dataType: "json" 
	})
	// 非同期処理実行
	.execute();
}
