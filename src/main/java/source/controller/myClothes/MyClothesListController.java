package source.controller.myClothes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import source.controller.BaseController;

/**
 * 服一覧に関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/MyClothesList")
public class MyClothesListController extends BaseController{

	/**
	 * 服一覧画面へ遷移する.
	 * @return 服一覧画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "pages/myClothes/myClothesList";
	}
	
}
