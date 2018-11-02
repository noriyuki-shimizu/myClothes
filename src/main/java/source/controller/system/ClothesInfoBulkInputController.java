package source.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import source.controller.base.BaseController;

/**
 * 服情報一括取り込みに関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/ClothesInfoBulkInput")
public class ClothesInfoBulkInputController extends BaseController{
	
	/**
	 * 服情報一括取り込み画面へ遷移する.
	 * @return 服情報一括取り込み画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "/pages/system/clothesInfoBulkInput";
	}

}
