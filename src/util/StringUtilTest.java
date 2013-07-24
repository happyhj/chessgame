package util;

import junit.framework.TestCase;
import util.StringUtil;

public class StringUtilTest extends TestCase {
	
	/**
	 * 줄바꿈 문자 static import
	 * @throws Exception
	 */
	public void testNEWLINE() throws Exception {
		assertEquals(System.getProperty("line.separator"), StringUtil.NEWLINE);
	}
	
	public void testAppendNewline(String newline) throws Exception {
		assertEquals("........"+System.getProperty("line.separator"),StringUtil.appendNewline("........"));
		
	}
}
