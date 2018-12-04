<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ブランド情報メンテナンス</title>
</head>
<body>

	<%@ include file="../../header/header.jsp"%>

	<div class="ink-tabs top" data-prevent-url-change="true">
		<!-- If you're using 'bottom' positioning, put this div AFTER the content. -->
		<ul class="tabs-nav">
			<li><a class="tabs-tab" href="#Home">Home</a></li>
			<li><a class="tabs-tab" href="#Grid">グリッド</a></li>
		</ul>

		<!-- Now just place your content -->
		<div id="home" class="tabs-content">
			<h1 class="fw-300">Home</h1>
			
		</div>
		<div id="grid" class="tabs-content">
			<h1 class="fw-300">News</h1>
			<div id="viewGrid">
				<table id="mcpGrid"></table>
				<div id="pager1"></div>
			</div>
		</div>
	</div>

</body>
<link type="text/css" media="screen" href="${pageContext.request.contextPath}/css/common/inputForm/inputFormHedder.css" rel="stylesheet" />
<script	src="${pageContext.request.contextPath}/js/common/inputForm/prot.inputForm.js"></script>
<script	src="${pageContext.request.contextPath}/js/pages/system/brandInfoMaintenance.js"></script>
</html>