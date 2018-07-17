/**
 * 入力フォームのサポートjsファイル.
 */

$(function() {

	// 初期表示：フォームを画面にアペンドする
	formAppend();
	
	// フォーム追加ボタン押下時のイベント
	$("#add_form_button").on('click', () => {
		formAppend();
	});
	
	// フォーム削除ボタン押下時のイベント
	$("#delete_form_button").on('click', () => {
		isFormChecked($(".select-regist-form")).then(resltFlg => {
			if(!resltFlg) {
				alert("フォームを選択してください。");
				return ;
			}
			if(isConfirm("選択されたフォームを削除します。\nよろしいですか？\n\n※入力されたフォーム内の情報も削除されてしまいます。")) {
				formRemove($(".select-regist-form")).then(() => {
					// フォームがすべて削除された場合
					if($(".form-div").length === 0) {
						// フォームを1つ追加する
						formAppend();
					}
				});
			}
		});
	});
	
	// 全選択がクリックされた際のイベント
	$("#select_all_button").on('click', () => {
		selectAllCheck();
	});
	
	// 全解除がクリックされた際のイベント
	$("#clear_all_button").on('click', () => {
		clearAllCheck();
	})
	
});

// フォームをアペンドする
function formAppend() {
	// フォームのクローン
	$cloneFormDiv = $("#form_div_template").clone();
	// フォームの数
	var formDivCnt = String($(".form-div").length + 1);
	
	// ========== クローンしたフォームの設定 ==========
	$cloneFormDiv.attr("id", "form_div" + formDivCnt);
	$cloneFormDiv.addClass("form-div");
	$cloneFormDiv.css("display", "");
	
	// jQuery UI カレンダーオプション設定
	$cloneFormDiv.find("#purchase_date").attr("id", "purchase_date" + formDivCnt);
	setDatepicker($cloneFormDiv.find("#purchase_date" + formDivCnt));

	// フォームの選択欄における設定
	$cloneFormDiv.find("#select_regist_form").attr("id", "select_regist_form" + formDivCnt);
	$cloneFormDiv.find("#check_regist_label").attr("for", "select_regist_form" + formDivCnt);
	$cloneFormDiv.find("#check_regist_label").attr("id", "check_regist_label" + formDivCnt);
	
	// 画像ファイル選択における設定
	$cloneFormDiv.find("#image_text").attr("id", "image_text" + formDivCnt);
	$cloneFormDiv.find("#file_select_button").attr("id", "file_select_button" + formDivCnt);
	$cloneFormDiv.find("#image_file").attr("id", "image_file" + formDivCnt)
	
	$("#form_main").append($cloneFormDiv);

	// 登録フォームのチェックボックスが変更時のイベント
	$("#select_regist_form" + formDivCnt).on("change", () => {
		var $selectRegistFormId = $("#select_regist_form" + formDivCnt);
		var $checkRegistLabel = $("#check_regist_label" + formDivCnt)
		selectRegistFormChangeText($selectRegistFormId, $checkRegistLabel);
	});
	
	// 画像入力欄、検索ボタン押下時イベント
	var imageClickEventString = "#image_text" + formDivCnt + ", #file_select_button" + formDivCnt;
	$(imageClickEventString).on("click", () => {
		$("#image_file" + formDivCnt).click();
	});
	
	// 画像ファイル選択時のイベント
	$("#image_file" + formDivCnt).on('change', function() {
		setFileName(this, $("#image_text" + formDivCnt));
		imageTooltipAppend(this, $("#image_text" + formDivCnt));
	});
	
}

// フォームの削除
async function formRemove($selectRegistForm) {
	$selectRegistForm.each((i, $element) => {
		selectFormRemove($element);
	});
	return ;
}

// 選択されたフォームの削除実行メソッド
function selectFormRemove(element) {
	return new Promise(resolve => {
		if($(element).prop("checked")) {
			$(element).parent().css("display", "none");
			$(element).parent().remove();
		}
		resolve();
	});
}

function selectRegistFormChangeText($selectRegistFormChecked, checkRegistLabel) {
	if($selectRegistFormChecked.prop('checked')) {
		$(checkRegistLabel).text("選択済");
		$(checkRegistLabel).css("color", "#0171bd");
	}
	else {
		$(checkRegistLabel).text("未選択");
		$(checkRegistLabel).css("color", "red");
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

//
function imageTooltipAppend(imageFile, $imageText) {
	if($(imageFile).prop('files')[0]) {
		$imageText.tooltip({disabled: false});
		var file = $(imageFile).prop('files')[0];
		var fr = new FileReader();
		fr.onload = function() {
			$imageText.tooltip({
				items: 'input',
				content: function() {
					var tooltipText = '<img src="' + fr.result + '" width="100%"/>'
					return tooltipText;
				}
			});
		}
		fr.readAsDataURL(file);
	} else {
		$imageText.tooltip({disabled: true});
	}
}

// ファイルが選択された際に発火する
function setFileName(imageFile, imageText) {
	// ファイルが選択されている場合
	if($(imageFile)[0].files[0]) {
		var imageFileName = $(imageFile)[0].files[0].name;
		$(imageText).val(imageFileName);
	} 
	// ファイルが選択されていない場合
	else {
		$(imageText).val("");
	}
}

// フォームが選択されているか判定
async function isFormChecked($selectRegistForms) {
	var checkedFlg = false;
	$selectRegistForms.each((i, selectRegistForm) => {
		if(i != 0 && $(selectRegistForm).prop("checked")) {
			checkedFlg = true;
		}
	});
	return checkedFlg;
}

function isConfirm(dialogMsg) {
	if(confirm(dialogMsg)) {
		return true;
	} else {
		return false;
	}
}

function selectAllCheck() {
	$(".select-regist-form").each((i, value) => {
		if(i === 0) return true;
		if(!$(value).prop('checked')) {
			$(value).prop('checked', true);
		}
	});
	$(".check-regist-label").each((i, value) => {
		if(i === 0) return true;
		$(value).text("選択済");
		$(value).css("color", "#0171bd");
	});
}

function clearAllCheck() {
	$(".select-regist-form").each((i, value) => {
		if(i === 0) return true;
		if($(value).prop('checked')) {
			$(value).prop('checked', false);
		}
	});
	$(".check-regist-label").each((i, value) => {
		if(i === 0) return true;
		$(value).text("未選択");
		$(value).css("color", "red");
	});
}