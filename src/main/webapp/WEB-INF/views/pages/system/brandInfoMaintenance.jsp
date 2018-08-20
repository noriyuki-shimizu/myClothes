<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ブランド情報メンテナンス</title>
</head>
<body>

	<%@ include file="../../header/header.jsp" %>
	
	<h1 class="pageTitle">ブランド情報メンテナンス</h1>
	<p id="inline"></p>
	
	<div id="viewGrid">
		<table id="brandInfoGrid"></table>
		<div id="pager1"></div>
	</div>

</body>
<script src="${pageContext.request.contextPath}/js/pages/system/brandInfoMaintenance.js"></script>
</html>