package source.controller.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import source.controller.BaseCommonController;
import source.dto.common.BMenuDto;
import source.service.common.BMenuService;

@Controller
@RequestMapping("/MenuInfo")
public class MenuInfoController extends BaseCommonController {

	@Autowired
	private BMenuService bMenuService;
	
	@RequestMapping(value="/getMenu", method=RequestMethod.GET)
	@ResponseBody
	public String getMenu() throws JsonProcessingException {
		List<BMenuDto> bMenuDtoList = bMenuService.findAll();
		
		String jsonValue = MAPPER.writeValueAsString(bMenuDtoList);
		
		
		
		return jsonValue;
	}
	
}
