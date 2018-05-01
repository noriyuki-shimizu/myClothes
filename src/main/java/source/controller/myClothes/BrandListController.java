package source.controller.myClothes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ブランド一覧に関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/BrandList")
public class BrandListController {
	
	/**
	 * ブランド一覧の初期画面へ遷移する.
	 * @return ブラント一覧画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "pages/myClothes/brandList";
	}

}
