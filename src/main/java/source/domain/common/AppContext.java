package source.domain.common;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * アプリケーションでのコンテキスト関連クラス.
 * 
 * @author Noriyuki-Shimizu
 *
 */
@Component
public class AppContext {

    /**
     * コンテキストを取得する.
     * @return
     */
    public static ServletContext getContext() {
        return ((ServletRequestAttributes)
        			RequestContextHolder
        			.getRequestAttributes())
        			.getRequest()
                    .getServletContext();
    }
	
}
