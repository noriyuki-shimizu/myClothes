package source.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 画像情報一括取り込みに関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/ImageInfoBulkInput")
public class ImageInfoBulkInputController {

	/**
	 * 初期画面を表示します.
	 * @return　画像情報一括取り込み画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "/pages/system/imageInfoBulkInput";
	}
	
}
