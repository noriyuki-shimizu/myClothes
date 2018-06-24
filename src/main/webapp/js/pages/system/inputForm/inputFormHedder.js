/**
 * 入力フォームのサポートjsファイル.
 */

$(function() {

	// jQuery UI カレンダーオプション設定
	setDatepicker();
	
	// 画像入力欄、検索ボタン押下時イベント
	$("#image_text, #file_select_button").on('click', function() {
		$("#image_file").click();
	});
	
	// 画像ファイル選択時のイベント
	$('input[name="imageFile"]').on('change', function() {
		setFileName($('input[name="imageText"]'));
	});
	
});

function setDatepicker() {
	// Datepicker オプションの初期値定義を変更
	$.datepicker.setDefaults({
		// 日本語へローカライズ
		closeText : '閉じる',
		prevText : '<前',
		nextText : '次>',
		currentText : '今日',
		monthNames : [ '1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月',
				'10月', '11月', '12月' ],
		monthNamesShort : [ '1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月',
				'9月', '10月', '11月', '12月' ],
		dayNames : [ '日曜日', '月曜日', '火曜日', '水曜日', '木曜日', '金曜日', '土曜日' ],
		dayNamesShort : [ '日', '月', '火', '水', '木', '金', '土' ],
		dayNamesMin : [ '日', '月', '火', '水', '木', '金', '土' ],
		weekHeader : '週',
		dateFormat : 'yy/mm/dd',
		firstDay : 0,
		isRTL : false,
		showMonthAfterYear : true,
		yearSuffix : '年',

		// 複数月のカレンダー表示
		numberOfMonths : 2,        // 2ヶ月分表示
		showCurrentAtPos : 0,      // 現在の月の表示位置は一番
		stepMonths : 2,            // 月の移動を3ヶ月単位とする
		showButtonPanel : true,    // ボタンパネルを表示
		gotoCurrent : true,        // ボタンパネルに当日日付のボタン表示

		// カレンダーを月曜始まりにする
		firstDay : 1,              // 月曜始まり

		// 年月をプルダウン選択にする
		changeYear : true,         // 年選択をプルダウン化
		changeMonth : true,        // 月選択をプルダウン化

		// カレンダーアイコンを用意する
		buttonImage : $("#contextPath").text()
				+ "/img/pages/system/inputForm/calendar.png", // カレンダーアイコン画像
		buttonText : "カレンダーから選択", // ツールチップ表示文言
		buttonImageOnly : true,      // 画像として表示
		showOn : "both"              // カレンダー呼び出し元の定義
	});

	// ライブラリの環境で「Today」が反応しないため、仕方なく以下で対処
	$.datepicker._gotoToday = function(id) {
		var target = $(id);
		var inst = this._getInst(target[0]);
		var date = new Date();
		this._setDate(inst,date);
		this._hideDatepicker();
	}

	$("#purchase_date").datepicker();
}

// ファイルが選択された際に発火する
function setFileName($imageText) {
	// ファイルが選択されている場合
	if($("#image_file")[0].files[0]) {
		var imageFileName = $("#image_file")[0].files[0].name;
		$imageText.val(imageFileName);
	} 
	// ファイルが選択されていない場合
	else {
		$imageText.val("");
		$imageText.attr('placeholder','選択されていません');
	}
}