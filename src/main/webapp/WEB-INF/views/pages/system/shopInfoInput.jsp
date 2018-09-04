<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>お店情報入力</title>
</head>
<body>

	<%@ include file="../../header/header.jsp" %>
	
	<div id="form_main">
		<div id="form_div_template">

			<input type="checkbox" name="selectRegistForm" id="select_regist_form" class="select-regist-form"/>
			<label for="select_regist_form" id="check_regist_label" class="check-regist-label">未選択</label>
			
			<form class="form" id="form1">
			
				<p class="input-text">
					<label class="input-title" for="shop_cd">お店CD</label><br>
					<input name="shopCd" type="text"
						class="feedback-input" id="shop_cd" />
				</p>

				<p class="input-text">
					<label class="input-title" for="shop_nm">お店名称</label><br>
					<input name="shopNm" type="text"
						class="feedback-input" id="shop_nm" />
				</p>
				
				<p class="input-text">
					<label class="input-title" for="postal_cd">郵便番号</label><br>
					<input name="postalCd" type="text" placeholder="012-3456"
						class="feedback-input" id="postal_cd" />
				</p>
	
				<p class="input-text">
					<label class="input-title" for="address">住所</label><br>
					<input name="address" type="text" placeholder="○○○県○○○市○○○"
						class="feedback-input" id="address" />
				</p>
				
				<p class="input-text">
					<label class="input-title" for="shop_url">ショップURL</label><br>
					<input name="shopUrl" type="text" placeholder="※必ずコピー&ペーストしてください。"
						class="feedback-input" id="shop_url" />
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
<script src="${pageContext.request.contextPath}/js/common/inputForm/inputFormHedder.js"></script>
<script src="${pageContext.request.contextPath}/js/pages/system/shopInfoInput.js"></script>

</html>