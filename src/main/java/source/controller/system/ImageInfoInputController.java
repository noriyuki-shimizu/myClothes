package source.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 画像情報入力に関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/ImageInfoInput")
public class ImageInfoInputController {

	/**
	 * 初期画面を表示します.
	 * @return 画像情報入力画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "/pages/system/imageInfoInput";
	}
	
}
