/**
 * ヘッダーに関するjsファイル.
 */

$(function() {
	// スマートメニュー実行
	$("#main-menu").smartmenus();
	
	// リンク無効
	$(".notLink").click(function() {
		return false;
	});
	
	// TODO: テンプレート一括取り込みのエラーについての処理を記述
	
});