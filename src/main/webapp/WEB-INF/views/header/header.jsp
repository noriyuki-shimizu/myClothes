<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<base href="/">
<meta charset="UTF-8">

<link href="${pageContext.request.contextPath}/css/header/header.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/common/jquery-ui/jquery-ui-1.12.1.custom/jquery-ui.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/common/smartmenus/sm-core-css.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/common/smartmenus/sm-blue.css" rel="stylesheet" type="text/css" />
<script src="${pageContext.request.contextPath}/common/jquery/jquery-1.11.0.min.js"></script>
<script src="${pageContext.request.contextPath}/common/jquery-ui/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/js/common/smartmenus/jquerySmartmenus.js"></script>
<script src="${pageContext.request.contextPath}/js/header/header.js"></script>
</head>
<header>
	<div id="contextPath">${pageContext.request.contextPath}</div>
</header>

<ul id="main-menu" class="sm sm-blue">
	<li><a href="${pageContext.request.contextPath}/topMenu/">トップメニュー</a></li>
	<li><a class="notLink" href="#">私の服</a>
		<ul>	
			<li><a href="${pageContext.request.contextPath}/MyClothesList/">服一覧</a></li>
			<li><a href="${pageContext.request.contextPath}/BrandList/">ブランド一覧</a></li>
			<li><a href="${pageContext.request.contextPath}/FrequentShopList/">よく行くお店</a></li>
			<li><a href="${pageContext.request.contextPath}/TotalInformation/">トータル情報</a></li>
		</ul>
	</li>
	<li><a class="notLink" href="#">システム</a>
		<ul>	
			<li><a href="${pageContext.request.contextPath}/ClothesInfoBulkInput/">服情報一括取り込み</a></li>
			<li><a href="${pageContext.request.contextPath}/ClothesInfoInput/">服情報入力</a>
<!-- 				<ul class="sub-menu"> -->
<!-- 					<li><a class="notLink" href="#">サブアイテム</a></li> -->
<!-- 					<li><a class="notLink" href="#">サブアイテム</a></li> -->
<!-- 					<li><a class="notLink" href="#">サブアイテム</a></li> -->
<!-- 				</ul> -->
			</li>
			<li><a href="${pageContext.request.contextPath}/ShopInfoBulkInput/">お店情報一括取り込み</a></li>
			<li><a href="${pageContext.request.contextPath}/ShopInfoInput/">お店情報入力</a></li>
			<li><a href="${pageContext.request.contextPath}/GenreInfoMaintenance/">ジャンル情報メンテナンス</a></li>
		</ul>
	</li>
	<li><a class="notLink" href="#">ヘルプ</a>
		<ul>	
			<li>
				<a href="${pageContext.request.contextPath}/BulkInputTemplates/ClothesInfo">服情報一括取り込み用テンプレート</a>
				<a href="${pageContext.request.contextPath}/BulkInputTemplates/ShopInfo">お店情報一括取り込み用テンプレート</a>
			</li>
		</ul>
	</li>
</ul>

</html>