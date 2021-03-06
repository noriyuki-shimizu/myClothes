<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>服情報入力</title>
</head>
<body>

	<%@ include file="../../header/header.jsp"%>

	<div id="form_main">
		<div id="form_div_template">

			<input type="checkbox" name="selectRegistForm" id="select_regist_form" class="select-regist-form"/>
			<label for="select_regist_form" id="check_regist_label" class="check-regist-label">未選択</label>
			
			<form class="form" id="form1">
			
				<p class="input-text">
					<label class="input-title" for="brand_cd">ブランドCD</label><br>
					<input name="brandCd" type="text"
						class="feedback-input" id="brand_cd" />
				</p>

				<p class="input-text">
					<label class="input-title" for="genre_cd">ジャンルCD</label><br>
					<input name="genreCd" type="text"
						class="feedback-input" id="genre_cd" />
				</p>
				
				<p class="input-text">
					<label class="input-title" for="shop_cd">お店CD</label><br>
					<input name="shopCd" type="text"
						class="feedback-input" id="shop_cd" />
				</p>
	
				<p class="input-file">
					<label class="input-title" for="image_file">画像ファイル</label><br>
					<input name="imageText" type="text" readonly="readonly"
						class="feedback-input" id="image_text" placeholder="選択されていません" />
					<button type="button" id="file_select_button" class="file-select-button">
						<span class="ui-icon ui-icon-search"></span>
					</button>
					<div class="float-clear"></div>
					<input name="imageFile" type="file" accept=".png"
						id="image_file" class="image-file"/>
				</p>
	
				<p class="input-text">
					<label class="input-title" for="price">金額</label><br>
					<input name="price" type="text"
						class="feedback-input" id="price" />
				</p>
	
				<p class="input-date">
					<label class="input-title" for="purchase_date">購入日</label><br>
					<input name="purchaseDate" type="text" placeholder="yyyy/MM/dd"
						class="feedback-input" id="purchase_date" />
					<div class="float-clear"></div>
				</p>
	
				<p class="input-textarea">
					<label class="input-title" for="details">備考</label><br>
					<textarea name="datails"
						class="feedback-input"
						id="details"></textarea>
				</p>
	
			</form>
		</div>
	</div>
	<div class="pageFooter">
		<div>
			<input type="button" value="フォーム追加" class="button-blue" id="add_form_button">
		</div>
		<div>
			<input type="button" value="フォーム削除" class="button-blue" id="delete_form_button">
		</div>
		<div>
			<input type="button" value="全選択" class="button-blue" id="select_all_button">
		</div>
		<div>
			<input type="button" value="全解除" class="button-blue" id="clear_all_button">
		</div>
		<div class="submit">
			<input type="submit" value="登録" class="button-blue" id="submit_button" />
			<div class="ease"></div>
		</div>
		<div class="float-clear"></div>
	</div>


</body>

<link type="text/css" media="screen" href="${pageContext.request.contextPath}/css/common/inputForm/inputFormHedder.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/js/common/inputForm/prot.inputForm.js"></script>
<script src="${pageContext.request.contextPath}/js/pages/system/clothesInfoInput.js"></script>

</html>
