package source.controller.help;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import source.service.help.ClothesInfoBulkInputTemplateService;

/**
 * 服情報一括取り込みテンプレートのダウンロードに関するコントローラ.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/ClothesInfoBulkInputTemplate")
public class ClothesInfoBulkInputTemplateController {
	
	@Autowired
	private ClothesInfoBulkInputTemplateService clothesInfoBulkInputTemplateService;
	
	/**
	 * テンプレートダウンロード処理.
	 * @param model
	 * @return トップメニュー画面
	 */
	@RequestMapping("/")
	public String execution(Model model) {
		int processResult = clothesInfoBulkInputTemplateService.csvDownload();

		if(processResult == -1) {
			model.addAttribute("clothesTopMenuErrMsg", "テンプレートのダウンロード中に例外が発生しました。");
		}
		
		return "pages/clothesTopMenu";
	}

}
