package source.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ブランド情報メンテナンスに関するコントローラ.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/BrandInfoMaintenance")
public class BrandInfoMaintenanceController {
	
	/**
	 * 初期画面を表示します.
	 * @return ブランド情報メンテナンス画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "/pages/system/brandInfoMaintenance";
	}

}
