<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/pages/clothesTopMenu.css" rel="stylesheet">
<title>トップメニュー</title>
</head>
<body>

	<%@ include file="../header/header.jsp" %>

	<div id="clothesTopMenuErrMsg"><c:out value="${clothesTopMenuErrMsg}"/></div>
	
	<div class="photo-show">
	    <img id="image_1" src="${pageContext.request.contextPath}/img/pages/clothesTopMenu/bukht_1.jpg">
	    <img id="image_2" src="${pageContext.request.contextPath}/img/pages/clothesTopMenu/neonsign_1.jpg">
	    <img id="image_3" src="${pageContext.request.contextPath}/img/pages/clothesTopMenu/youji_1.jpg">
	    <img id="image_4" src="${pageContext.request.contextPath}/img/pages/clothesTopMenu/bukht_2.jpg">
	    <img id="image_5" src="${pageContext.request.contextPath}/img/pages/clothesTopMenu/neonsign_2.png">
    	<img id="image_6" src="${pageContext.request.contextPath}/img/pages/clothesTopMenu/bukht_3.jpg">
	    <img id="image_7" src="${pageContext.request.contextPath}/img/pages/clothesTopMenu/youji_2.jpg">
	    <img id="image_8" src="${pageContext.request.contextPath}/img/pages/clothesTopMenu/bukht_2.jpg">
	</div>

</body>
</html>