package source.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * お店情報一括取り込みに関するコントローラクラス.
 * @author Noriyuki-Shimizu
 */
@Controller
@RequestMapping("/ShopInfoBulkInput")
public class ShopInfoBulkInputController {
	
	/**
	 * 初期画面を表示します.
	 * @return お店情報一括取り込み画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "/pages/system/shopInfoBulkInput";
	}
	
}