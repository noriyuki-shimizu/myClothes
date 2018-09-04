/**
 * ヘッダーに関するjsファイル.
 */

$(function() {

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
	
	// TODO: テンプレート一括取り込みのエラーについての処理を記述
	
});
