package source.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import source.controller.BaseController;

/**
 * お店情報入力に関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/ShopInfoInput")
public class ShopInfoInputController extends BaseController{
	
	/**
	 * お店情報入力画面へ遷移する.
	 * @return お店情報入力画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "pages/system/shopInfoInput";
	}

}
