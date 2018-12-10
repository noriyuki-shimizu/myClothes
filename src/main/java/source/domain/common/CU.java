package source.domain.common;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class CU {

	public static <T> boolean isListSizeToZero(List<T> list) {
		return list.size() == 0;
	}
	
	public static <T> boolean isObjectToNull(T object) {
		return object == null;
	}
	
	public static boolean isNullOrEmptyStr(String str) {
		return StringUtils.isEmpty(str);
	}
	
}
