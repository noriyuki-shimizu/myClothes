package source.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 共通部分のController.
 * 
 * @author Noriyuki-Shimizu
 *
 */
public class BaseCommonController {

	/**	JSON型を変換する */
	protected static final ObjectMapper MAPPER = new ObjectMapper();
	
}
