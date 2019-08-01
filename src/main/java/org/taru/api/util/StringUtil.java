package org.taru.api.util;

public class StringUtil {
	/**
	 * 把对象转换成字符串
	 */
	public static String valueOf(Object obj) {
		if(obj!=null) {
			return obj.toString();
		}
		return null;
		
	}
}
