package source.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import source.controller.BaseController;

/**
 * 服情報入力に関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/ClothesInfoInput")
public class ClothesInfoInputController extends BaseController{
	
	/**
	 * 服情報入力画面へ遷移する.
	 * @return 服情報入力画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "pages/system/clothesInfoInput";
	}

}
