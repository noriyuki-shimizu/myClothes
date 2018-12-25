<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="source.domain.common.AppCookie"%>
<%@ page import="source.domain.common.CU"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	//Cookieから"test_cookie_name"というKeyで登録された値(文字列)を取り出す
	final String contextCookieKey = "contextPath";
	String value = AppCookie.getCookie(request, contextCookieKey);
	
	//valueがnullの場合のみCookieをセットする(期限は5分)
	if (CU.isObjectToNull(value)) {
		AppCookie.setCookie(request, response, "/", contextCookieKey, 5 * 60);
	}
%>

<!DOCTYPE html>
<html>
<head>
<base href="/">
<meta charset="UTF-8">

<%@ include file="../includeCSS.jsp" %>
<%@ include file="../includeJS.jsp" %>

</head>

<div class="header">
	<header>
		<div id="contextPath">${pageContext.request.contextPath}</div>
	</header>
	
	<div id="header-menu">
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
					<li><a href="${pageContext.request.contextPath}/ClothesInfoInput/">服情報入力</a></li>
					<li><a href="${pageContext.request.contextPath}/ShopInfoBulkInput/">お店情報一括取り込み</a></li>
					<li><a href="${pageContext.request.contextPath}/ShopInfoInput/">お店情報入力</a></li>
					<li><a href="${pageContext.request.contextPath}/BrandInfoMaintenance/">ブランド情報メンテナンス</a></li>
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
	</div>
	
	<div class="ui-widget-msg" style="display: none;">
	  <div>
	    <p class="view-message">
	    	<span></span>
	    	<input type="button" value="×" class="close-msg-button">
	    </p>
	  </div>
	</div>
	
</div>

<h1 class="pageTitle">★項目未登録★</h1>
<p id="inline"></p>

</html>