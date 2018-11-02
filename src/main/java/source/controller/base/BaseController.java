package source.controller.base;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class BaseController {
	
	/**	JSON型を変換する */
	protected static final ObjectMapper MAPPER = new ObjectMapper();
	
	public abstract String initPage();

}
