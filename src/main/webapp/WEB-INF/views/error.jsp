<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>致命的エラー</title>
</head>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common/ink/ink.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/error.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/error.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common/ink/ink-all.min.js"></script>

<body>

	<div id="error-parent">
		<img alt="alert"
			src="${pageContext.request.contextPath}/img/error/alert.ico">

	    <p id="error-message"><c:out value="${errMsg}" /></p>

	</div>

</body>
</html>