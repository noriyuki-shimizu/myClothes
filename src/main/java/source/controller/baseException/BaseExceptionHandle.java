package source.controller.baseException;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * GrovalExceptionHandler.
 * @author Noriyuki-Shimizu
 *
 */
@ControllerAdvice
public class BaseExceptionHandle {

	private Map<String, Object> errorMap;
	
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	@ExceptionHandler({ JsonProcessingException.class })
	@ResponseBody
	public Map<String, Object> JsonProcessingError() {
		errorMap = new HashMap<String, Object>();
		errorMap.put("message", "JSONでの変換処理エラー");
		errorMap.put("status", HttpStatus.METHOD_NOT_ALLOWED);
		return errorMap;
	}
	
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	@ExceptionHandler({ NullPointerException.class })
	@ResponseBody
	public Map<String, Object> NullPointerError() {
		this.errorMap = new HashMap<String, Object>();
		errorMap.put("message", "Nullエラー");
		errorMap.put("status", HttpStatus.METHOD_NOT_ALLOWED);
		return errorMap;
	}

}
