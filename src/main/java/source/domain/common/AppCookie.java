package source.domain.common;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppCookie {

	public static String getCookie(HttpServletRequest request, final String name) {
		String result = null;

		Cookie[] cookies = request.getCookies();
		if (!CU.isObjectToNull(cookies)) {
			for (Cookie cookie : cookies) {
				if (name.equals(cookie.getName())) {
					return result;
				}
			}
		}

		return result;
	}

	public static void setCookie(HttpServletRequest request, HttpServletResponse response, String path, String name,
			int maxAge) throws UnsupportedEncodingException {
		
		// Cookieに保存するContextPathを取得
		String contextPath = AppContext.getContext().getContextPath();
		
		// エンコード
		String encodedResult = URLEncoder.encode(contextPath, "UTF-8");
		
		Cookie cookie = new Cookie(name, encodedResult);
		cookie.setMaxAge(maxAge);
		cookie.setPath(path);
		// httpsで稼働している環境であればCookieが暗号化されるようSecure属性をつける
		final String https = "https";
		if (https.equals(request.getScheme())) {
			cookie.setSecure(true);
		}
		response.addCookie(cookie);
	}
	// 76005_N.Y-0612
	
}
