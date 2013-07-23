package util;

import junit.framework.TestCase;
import static util.StringUtil.NEWLINE;

public class StringUtilTest extends TestCase {
	
	/**
	 * 줄바꿈 문자 static import
	 * @throws Exception
	 */
	public void testNEWLINE() throws Exception {
		assertEquals(System.getProperty("line.separator"), NEWLINE);
	}
	
	
}
