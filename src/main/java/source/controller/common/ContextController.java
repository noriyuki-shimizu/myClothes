package source.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import source.domain.common.AppContext;

@Controller
@RequestMapping("/Context")
public class ContextController {

	@RequestMapping("/get")
	@ResponseBody
	public String get() {
		String contextPath = AppContext.getContext().getContextPath();
		
		return contextPath;
	}
	
}
