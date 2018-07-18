package source.controller.help;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import source.service.help.BulkInputTemplatesService;

/**
 * 一括取り込み用テンプレートのダウンロードに関するコントローラ.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/BulkInputTemplates")
public class BulkInputTemplatesController {
	
	@Autowired
	private BulkInputTemplatesService bulkInputTemplatesService;
	
	/**
	 * 【服情報一括取り込み】テンプレートダウンロード処理.
	 * @param model
	 * @return トップメニュー画面
	 */
	@RequestMapping("/ClothesInfo")
	public String ClothesInfo(Model model) {
		int processResult = bulkInputTemplatesService.clothesInfoCsvDownload();

		if(processResult == -1) {
			model.addAttribute("clothesTopMenuErrMsg", "テンプレートのダウンロード中に例外が発生しました。");
		}
		
		return "pages/clothesTopMenu";
	}
	
	/**
	 * 【お店情報一括取り込み】テンプレートダウンロード処理.
	 * @param model
	 * @return トップメニュー画面
	 */
	@RequestMapping("/ShopInfo")
	public String ShopInfo(Model model) {
		int processResult = bulkInputTemplatesService.shopInfoCsvDownload();
		
		if(processResult == -1) {
			model.addAttribute("clothesTopMenuErrMsg", "テンプレートのダウンロード中に例外が発生しました。");
		}
		
		return "pages/clothesTopMenu";
	}

}
