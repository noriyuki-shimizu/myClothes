package source.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import source.controller.base.BaseCommonController;

/**
 * スクリーン情報に関するコントローラクラスs.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/ScreenInfo")
public class ScreenInfoController extends BaseCommonController {

	@RequestMapping("/getScreen")
	@ResponseBody
	public String getScreen() {
		return null;
	}
	
}
