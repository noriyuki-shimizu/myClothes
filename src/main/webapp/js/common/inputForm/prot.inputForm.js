/**
 * 入力フォームのサポートjsファイル.
 */

var InputForm = {
	create: function() {
		var inputForm = Object.create(InputForm.prototype);
		
		inputForm.o = Object.freeze({type: 'InputForm'});
		
		inputForm.formDivCount = null;
		
		return inputForm;
	},
	firstElementFocus: function(formDivCnt) {
		// 新しく追加されたフォームにフォーカスを合わせる
		var parentForm = $("#form_div" + formDivCnt).find(".form");
		// フォーカスを合わせる最初の要素取得
		var nextFromOnFocus = $(parentForm).find("p")[0];
		nextFromOnFocus = $(nextFromOnFocus).children()[2];
		// フォーカスを合わせる最後の要素取得
		var lastElementForm = $(parentForm).find("p")[$(parentForm).find("p").length - 1];
		lastElementForm = $(lastElementForm).children()[2];
		// フォーカスを合わせる
		$(lastElementForm).focus();
		$(lastElementForm).blur();
		$(nextFromOnFocus).focus();
	},
	setElementsEvent: function(formDivCnt) {
		// 登録フォームのチェックボックスが変更時のイベント
		$("#select_regist_form" + formDivCnt).on("change", () => {
			var $selectRegistFormId = $("#select_regist_form" + formDivCnt);
			var $checkRegistLabel = $("#check_regist_label" + formDivCnt)
			InputForm.selectRegistFormChangeText($selectRegistFormId, $checkRegistLabel);
		});
		
		// 画像入力欄、検索ボタン押下時イベント
		var imageClickEventString = "#image_text" + formDivCnt + ", #file_select_button" + formDivCnt;
		$(imageClickEventString).on("click", () => {
			$("#image_file" + formDivCnt).click();
		});
		
		// 画像ファイル選択時のイベント
		$("#image_file" + formDivCnt).on('change', function() {
			InputForm.setFileName(this, $("#image_text" + formDivCnt));
			InputForm.imageTooltipAppend(this, $("#image_text" + formDivCnt));
		});
	},
	// フォームの削除
	formRemove: async function($selectRegistForm) {
		$selectRegistForm.each((i, $element) => {
			InputForm.selectFormRemove($element);
		});
		return ;
	},
	// 選択されたフォームの削除実行メソッド
	selectFormRemove: function(selectedElement) {
		return new Promise(resolve => {
			if($(selectedElement).prop("checked")) {
				$(selectedElement).parent().css("display", "none");
				$(selectedElement).parent().remove();
			}
			resolve();
		});
	},
	selectRegistFormChangeText: function($selectRegistFormChecked, checkRegistLabel) {
		if($selectRegistFormChecked.prop('checked')) {
			$(checkRegistLabel).text("選択済");
			$(checkRegistLabel).css("color", "#0171bd");
			return ;
		}
		$(checkRegistLabel).text("未選択");
		$(checkRegistLabel).css("color", "red");
	},
	setDatepicker: function($purchaseDate) {
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
	},
	imageTooltipAppend: function(imageFile, $imageText) {
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
			
			return ;
		}
		
		$imageText.tooltip({disabled: true});
	},
	// ファイルが選択された際に発火する
	setFileName: function(imageFile, imageText) {
		// ファイルが選択されている場合
		if($(imageFile)[0].files[0]) {
			var imageFileName = $(imageFile)[0].files[0].name;
			$(imageText).val(imageFileName);
			return ;
		} 
		// ファイルが選択されていない場合
		$(imageText).val("");
	},
	// フォームが選択されているか判定
	isFormChecked: async function($selectRegistForms) {
		var checkedFlg = false;
		$selectRegistForms.each((i, selectRegistForm) => {
			i != 0 && $(selectRegistForm).prop("checked") ? checkedFlg = true : void 0;
		});
		return checkedFlg;
	},
	isConfirm: function(dialogMsg) {
		return confirm(dialogMsg) ? true : false;
	},
	selectAllCheck: function() {
		$(".select-regist-form").each((i, value) => {
			if(i === 0) return true;
			!$(value).prop('checked') ? $(value).prop('checked', true) : void 0;
		});
		$(".check-regist-label").each((i, value) => {
			if(i === 0) return true;
			$(value).text("選択済");
			$(value).css("color", "#0171bd");
		});
	},
	clearAllCheck: function() {
		$(".select-regist-form").each((i, value) => {
			if(i === 0) return true;
			$(value).prop('checked') ? $(value).prop('checked', false) : void 0;
		});
		$(".check-regist-label").each((i, value) => {
			if(i === 0) return true;
			$(value).text("未選択");
			$(value).css("color", "red");
		});
	},
	// プロトタイプオブジェクト
	prototype: {
		
		resetOption: function() {
			this.formDivCount = null;
		},
		
		setFormDivCount: function() {
			this.formDivCount = String($(".form-div").length + 1);
		},
		
		searchFormEventSet: function() {
			// formの先頭要素にフォーカスを合わせる
			var searchFormDiv = $('.search-form-div').find('.form');
			var p = $(searchFormDiv).find('p')[0];
			var elementsToFocusOn = $(p).children()[2];
			// フォーカスを合わせる
			$(elementsToFocusOn).focus();
			
			return this;
		},
		
		inputFormEventSet: function() {
			var inputForm = this;

			// フォーム追加ボタン押下時のイベント
			$("#add_form_button").on('click', () => {
				inputForm.$formAppend();
			});
			
			// TODO: prototypeに切り出して！
			// フォーム削除ボタン押下時のイベント
			$("#delete_form_button").on('click', () => {
				InputForm.isFormChecked($(".select-regist-form")).then(resltFlg => {
					if(!resltFlg) {
						// エラーメッセージの表示
						mcpMessage
							.messageClear()
							.viewMessage()
							.setMessage("フォームを選択してください。")
							.displayError();
						return ;
					}
					
					mcpMessage
						.messageClear()
						.closeMessage();

					const formDeleteConfirmMsg = '選択されたフォームを削除します。\nよろしいですか？\n\n※入力されたフォーム内の情報も削除されてしまいます。';
					var exeFunc = function() {
						if(InputForm.isConfirm(formDeleteConfirmMsg)) {
							InputForm.formRemove($(".select-regist-form")).then(() => {
								// フォームがすべて削除された場合
								// true -> フォームを1つ追加する
								$(".form-div").length === 0 ? inputForm.$formAppend() : void 0;
							});
						}
					}
					
					this.timeoutExecute(exeFunc, 100);
					
				});
			});
			
			// 全選択がクリックされた際のイベント
			$("#select_all_button").on('click', () => {
				InputForm.selectAllCheck();
			});
			
			// 全解除がクリックされた際のイベント
			$("#clear_all_button").on('click', () => {
				InputForm.clearAllCheck();
			});
			
			return this;
		},
		
		$formAppend: function() {
			// フォームのクローン
			$cloneFormDiv = $("#form_div_template").clone();
			// フォームの数設定
			this.setFormDivCount();
			
			// ========== クローンしたフォームの設定 ==========
			
			// formのid設定
			$cloneFormDiv.attr("id", "form_div" + this.formDivCount);
			
			// formの選択チェックボックスのid,lavel設定
			$cloneFormDiv.find("#select_regist_form").attr("id", "select_regist_form" + this.formDivCount);
			$cloneFormDiv.find("#check_regist_label").attr("for", "select_regist_form" + this.formDivCount);
			$cloneFormDiv.find("#check_regist_label").attr("id", "check_regist_label" + this.formDivCount);
			
			// カレンダーのid設定
			$cloneFormDiv.find("#purchase_date").attr("id", "purchase_date" + this.formDivCount);
			
			// 画像ファイル選択における設定
			$cloneFormDiv.find("#image_text").attr("id", "image_text" + this.formDivCount);
			$cloneFormDiv.find("#file_select_button").attr("id", "file_select_button" + this.formDivCount);
			$cloneFormDiv.find("#image_file").attr("id", "image_file" + this.formDivCount)
			
			// formのclass設定
			$cloneFormDiv.addClass("form-div");
			
			// 非表示を表示に変換
			$cloneFormDiv.css("display", "");
			
			// jQuery UI カレンダーオプション設定
			InputForm.setDatepicker($cloneFormDiv.find("#purchase_date" + this.formDivCount));

			// jspにformをアペンド
			$("#form_main").append($cloneFormDiv);

			// 要素にフォーカスを合わせる
			InputForm.firstElementFocus(this.formDivCount);

			// フォームの要素にイベントをセットする
			InputForm.setElementsEvent(this.formDivCount);
		},
		timeoutExecute: function(exeFunc, time) {
			setTimeout(() => {
				exeFunc();
			}, time);
		}
	}
}

var mcpInputForm = InputForm.create();