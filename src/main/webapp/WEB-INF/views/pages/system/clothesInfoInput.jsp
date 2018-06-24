<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>服情報入力</title>
</head>
<body>

	<%@ include file="../../header/header.jsp"%>

	<h1 class="pageTitle">服情報入力</h1>

	<div id="form-main">
		<div class="form-div">
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
					<label class="input-title" for="image">画像ファイル</label><br>
					<input name="imageText" type="text" readonly="readonly"
						class="feedback-input" id="image_text" placeholder="選択されていません">
					<button type="button" id="file_select_button">
						<span class="ui-icon ui-icon-search"></span>
					</button>
					<div class="float-clear"></div>
					<input name="imageFile" type="file" id="image_file" />
				</p>
	
				<p class="input-text">
					<label class="input-title" for="price">金額</label><br>
					<input name="price" type="text"
						class="feedback-input" id="price" />
				</p>
	
				<p class="input-date">
					<label class="input-title" for="purchase_date">購入日</label><br>
					<input name="purchaseDate" type="text"
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
		<div class="submit">
			<input type="submit" value="登録" id="button-blue" />
			<div class="ease"></div>
		</div>
	</div>


</body>

<link type="text/css" media="screen" href="${pageContext.request.contextPath}/css/pages/system/inputForm/inputFormHedder.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/js/pages/system/inputForm/inputFormHedder.js"></script>

</html>
