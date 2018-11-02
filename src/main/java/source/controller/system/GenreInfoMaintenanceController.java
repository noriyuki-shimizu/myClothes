package source.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import source.controller.base.BaseController;

/**
 * ジャンル情報メンテナンスに関するコントローラクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/GenreInfoMaintenance")
public class GenreInfoMaintenanceController extends BaseController{
	
	/**
	 * 初期画面を表示します.
	 * @return ジャンル情報メンテナンス画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "/pages/system/genreInfoMaintenance";
	}

}
