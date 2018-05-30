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

				<p class="inputValue">
					<input name="name" type="text"
						class="feedback-input"
						placeholder="Name" id="name" />
				</p>
				<!-- TODO: idとかclassをどうにかして。。。美しくできない限り、次へ行くな。。。 -->

				<p class="email">
					<input name="email" type="text"
						class="feedback-input" id="email"
						placeholder="Email" />
				</p>

				<p class="text">
					<textarea name="text"
						class="feedback-input"
						id="comment" placeholder="Comment"></textarea>
				</p>

			</form>
		</div>
		<div class="submit">
			<input type="submit" value="登録" id="button-blue" />
			<div class="ease"></div>
		</div>
	</div>


</body>
</html>
