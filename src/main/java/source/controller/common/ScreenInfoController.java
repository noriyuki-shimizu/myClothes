package source.controller.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import source.controller.BaseCommonController;
import source.dto.common.BScreenDto;
import source.service.common.BScreenService;

/**
 * スクリーン情報に関するコントローラクラスs.
 * @author Noriyuki-Shimizu
 *
 */
@Controller
@RequestMapping("/ScreenInfo")
public class ScreenInfoController extends BaseCommonController {
	
	@Autowired
	private BScreenService bScreenService;

	@RequestMapping("/getScreen")
	@ResponseBody
	public String getScreen() throws JsonProcessingException {
		List<BScreenDto> screenDtoList = bScreenService.findAll();
		
		String jsonValue = MAPPER.writeValueAsString(screenDtoList);
		
		return jsonValue;
	}
	
}
