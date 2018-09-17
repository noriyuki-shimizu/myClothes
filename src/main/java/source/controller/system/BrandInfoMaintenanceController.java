package source.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import source.entity.MBrandEntity;
import source.service.myClothes.MBrandService;

/**
 * ブランド情報メンテナンスに関するコントローラ.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/BrandInfoMaintenance")
public class BrandInfoMaintenanceController {
	
	/**	JSON型を変換する */
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	@Autowired
	private MBrandService mBrandService;
	
	/**
	 * 初期画面を表示します.
	 * @return ブランド情報メンテナンス画面
	 */
	@RequestMapping("/")
	public String initPage() {
		return "/pages/system/brandInfoMaintenance";
	}
	
	/**
	 * ブランド一覧を取得する(全件取得).
	 * @return ブランドリスト
	 * @throws JsonProcessingException
	 */
	@RequestMapping(value = "/getDataList", method = RequestMethod.GET)
	@ResponseBody
	public String getDataList() throws JsonProcessingException {
		List<MBrandEntity> mBrandList = mBrandService.findAll();
		return MAPPER.writeValueAsString(mBrandList);
	}

}
