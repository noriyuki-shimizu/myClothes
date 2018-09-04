<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ブランド情報メンテナンス</title>
</head>
<body>

	<%@ include file="../../header/header.jsp" %>
	
	<div id="search_form_main">
		<div class="search-form-div">
			<form class="form" id="form1">
				<p class="input-text">
					<label class="input-title" for="brand_cd">ブランドCD</label><br>
					<input name="brandCd" type="text"
						class="feedback-input" id="brand_cd" />
				</p>
			</form>
		</div>
	</div>
	
	<div id="viewGrid">
		<table id="brandInfoGrid"></table>
		<div id="pager1"></div>
	</div>

</body>
<link type="text/css" media="screen" href="${pageContext.request.contextPath}/css/common/inputForm/inputFormHedder.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/js/common/inputForm/inputFormHedder.js"></script>
<script src="${pageContext.request.contextPath}/js/pages/system/brandInfoMaintenance.js"></script>
</html>