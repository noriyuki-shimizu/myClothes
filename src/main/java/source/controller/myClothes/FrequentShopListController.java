package source.controller.myClothes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import source.controller.base.BaseController;

/**
 * よく行くお店に関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/FrequentShopList")
public class FrequentShopListController extends BaseController{

	/**
	 * よく行くお店のページへ遷移する.
	 * @return よく行くお店画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "pages/myClothes/frequentShopList";
	}
	
}
