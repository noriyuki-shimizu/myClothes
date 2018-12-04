package source.controller.topMenu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import source.controller.base.BaseController;
import source.domain.common.AppContext;

/**
 * トップメニューに関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/topMenu")
public class ClothesTopMenuController extends BaseController{
	
	/**
	 * トップメニュー（初期画面）を表示します.
	 * 
	 * @return トップメニュー画面
	 */
	@RequestMapping("/")
	public String initPage() {
		System.out.println(AppContext.getContext().getContextPath());
		return "pages/clothesTopMenu";
	}
	
}
