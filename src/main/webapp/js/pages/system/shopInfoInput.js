/**
 * お店情報入力に関するjsファイル.
 */

$(function() {
	
	// ページタイトルの設定
	$(".pageTitle").text("お店情報入力");
	
	// 初期表示：フォームを画面にアペンドする
	mcpInputForm
		.inputFormEventSet()
		.$formAppend();
	
});