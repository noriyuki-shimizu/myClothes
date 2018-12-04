package source.controller.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * GrovalExceptionHandler.
 * 
 * @author Noriyuki-Shimizu
 *
 */
@Component
public class BaseExceptionHandle implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(
			HttpServletRequest request,
			HttpServletResponse response,
			Object object,
			Exception e) {

		ModelAndView mav = new ModelAndView();
		// Viewに表示するメッセージをセットします。
		mav.addObject("errMsg", "致命的エラーが発生しました。管理者に問い合わせてください。\n" + " 詳細：【" + e + "】");

		// 遷移先のViewを指定します。(error.jspに遷移します。)
		mav.setViewName("/error");
		
		return mav;
	}

}
