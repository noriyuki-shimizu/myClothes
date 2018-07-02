/**
 * 入力フォームのサポートjsファイル.
 */

$(function() {

	// 初期表示：フォームを画面にアペンドする
	formAppend();
	
	// TODO: これうまくいかないから。。。
	// 画像入力欄、検索ボタン押下時イベント
	$(document).on('click', "#image_text, #file_select_button", function() {
		$("#image_file").click();
	});
	
	// 画像ファイル選択時のイベント
	$(document).on('change', "#image_file", function() {
		setFileName($('input[name="imageText"]'));
	});
	
	// フォーム追加ボタン押下時のイベント
	$("#add_form_button").on('click', function() {
		formAppend();
	});
	
	// フォーム削除ボタン押下時のイベント
	$("#delete_form_button").on('click', function() {
		if(isConfirm("選択されたフォームを削除します。\nよろしいですか？\n\n※入力されたフォーム内の情報も削除されてしまいます。")) {
			formRemove($(".select-regist-form")).then(function() {
				// フォームがすべて削除された場合
				if($(".form-div").length === 0) {
					// フォームを1つ追加する
					formAppend();
				}
			});
		}
	});
	
});

// フォームをアペンドする
function formAppend() {
	// フォームのクローン
	$cloneFormDiv = $("#form_div_template").clone();
	// フォームの数
	var formDivCnt = String($("#form_main").children().length);
	
	// ========== クローンしたフォームの設定 ==========
	$cloneFormDiv.attr("id", "form_div" + formDivCnt);
	$cloneFormDiv.addClass("form-div");
	$cloneFormDiv.css("display", "");
	
	// jQuery UI カレンダーオプション設定
	$cloneFormDiv.find("#purchase_date").attr("id", "purchase_date" + formDivCnt);
	setDatepicker($cloneFormDiv.find("#purchase_date" + formDivCnt));
	
	$cloneFormDiv.find("#select_regist_form").attr("id", "select_regist_form" + formDivCnt);
	$cloneFormDiv.find("#check_regist_label").attr("for", "select_regist_form" + formDivCnt);
	$cloneFormDiv.find("#check_regist_label").attr("id", "check_regist_label" + formDivCnt);

	$("#form_main").append($cloneFormDiv);
	
	// 登録フォームのチェックボックスが変更時のイベント
	$("#select_regist_form" + formDivCnt).on("change", function() {
		var selectRegistFormId = $("#select_regist_form" + formDivCnt + ":checked");
		selectRegistFormChangeText(selectRegistFormId, formDivCnt);
	});
	
}

// フォームの削除
function formRemove($selectRegistForm) {
	// promise
	var d = new $.Deferred();
	
	// 選択されたフォームを削除する
	$selectRegistForm.each((i, $element) => {
		if($($element).prop('checked')) {
			$($element).parent().css("display", "none");
			$($element).parent().removeClass();
			d.resolve();
		}
	});
	return d.promise();
}

function selectRegistFormChangeText($selectRegistFormChecked, formDivCnt) {
	var checkRegistLabelId = "#check_regist_label" + formDivCnt;
	if($selectRegistFormChecked.prop('checked')) {
		$(checkRegistLabelId).text("選択済");
		$(checkRegistLabelId).css("color", "#0171bd");
	}
	else {
		$(checkRegistLabelId).text("未選択");
		$(checkRegistLabelId).css("color", "red");
	}
}

function setDatepicker($purchaseDate) {
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

	$purchaseDate.datepicker();
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
	}
}

function isConfirm(dialogMsg) {
	if(confirm(dialogMsg)) {
		return true;
	} else {
		return false;
	}
}
