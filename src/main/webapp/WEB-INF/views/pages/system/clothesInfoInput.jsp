<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>服情報入力</title>
</head>
<link type="text/css" media="screen" href="${pageContext.request.contextPath}/css/pages/system/inputForm/inputFormHedder.css" rel="stylesheet" />
<body>

	<%@ include file="../../header/header.jsp"%>

	<h1 class="pageTitle">服情報入力</h1>

	<div id="form-main">
		<div class="form-div">
			<form class="form" id="form1">

				<input name="brandCd" type="text"
					class="feedback-input"
					placeholder="ブランドCD" id="brand_cd" />

				<input name="genreCd" type="text"
					class="feedback-input" id="genre_cd"
					placeholder="ジャンルCD" />

				<input name="shopCd" type="text"
					class="feedback-input" id="shop_cd"
					placeholder="お店CD" />

				<input name="image" type="text"
					class="feedback-input" id="image"
					placeholder="画像（テキストじゃねーぞこら）" />

				<input name="price" type="text"
					class="feedback-input" id="price"
					placeholder="金額" />

				<input name="purchaseDate" type="text"
					class="feedback-input" id="purchase_date"
					placeholder="購入日" />

				<textarea name="text"
					class="feedback-input"
					id="details" placeholder="備考"></textarea>

			</form>
		</div>
		<div class="submit">
			<input type="submit" value="登録" id="button-blue" />
			<div class="ease"></div>
		</div>
	</div>


</body>
</html>
