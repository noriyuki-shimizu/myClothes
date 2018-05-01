package source.controller.myClothes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * トータル情報に関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/TotalInformation")
public class TotalInformationController {

	/**
	 * トータル情報画面へ遷移する.
	 * @return トータル情報画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "pages/myClothes/totalInformation";
	}
	
}
