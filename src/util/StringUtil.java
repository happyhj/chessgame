package util;

public class StringUtil {
	
	public interface NEWLINE {

	}

	/**
	 * 줄바꿈 문자를 유틸리티클래스인 StringUtil의 클래스상수로 선언하여 사용하였다. 
	 */
	public static final String NEWLINE = System.getProperty("line.separator");
	
	private StringUtil() {}
	
}
