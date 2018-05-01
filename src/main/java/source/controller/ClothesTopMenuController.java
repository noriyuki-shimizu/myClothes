package source.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * トップメニューに関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/topMenu")
public class ClothesTopMenuController {

	/**
	 * トップメニュー（初期画面）を表示します.
	 * 
	 * @return トップメニュー画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "pages/clothesTopMenu";
	}
	
}
