package util;

public class StringUtil {
	
	private StringUtil() {}


	/**
	 * 줄바꿈 문자를 유틸리티클래스인 StringUtil의 클래스상수로 선언하여 사용하였다. 
	 */
	public static final String NEWLINE = System.getProperty("line.separator");
	
	/**
	 * 문자열을 받아 뒤에 줄바꿈문자를 더해주고 반환한다.
	 * @param string
	 * @return
	 */
	public static String appendNewline(String string) {
		StringBuilder withNewline = new StringBuilder(string);
		withNewline.append(NEWLINE);
		return withNewline.toString();
	}
	
}
