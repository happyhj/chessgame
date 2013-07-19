import junit.framework.TestCase;

public class CharacterTest extends TestCase {
	/**
	 * isWhitespace 메서드가 참을 반환하는 공백문자들. 
	 * <li> It is a Unicode space character ({@code SPACE_SEPARATOR},
     *      {@code LINE_SEPARATOR}, or {@code PARAGRAPH_SEPARATOR})
     *      but is not also a non-breaking space ({@code '\u005Cu00A0'},
     *      {@code '\u005Cu2007'}, {@code '\u005Cu202F'}).
     * <li> It is {@code '\u005Ct'}, U+0009 HORIZONTAL TABULATION.
     * <li> It is {@code '\u005Cn'}, U+000A LINE FEED.
     * <li> It is {@code '\u005Cu000B'}, U+000B VERTICAL TABULATION.
     * <li> It is {@code '\u005Cf'}, U+000C FORM FEED.
     * <li> It is {@code '\u005Cr'}, U+000D CARRIAGE RETURN.
     * <li> It is {@code '\u005Cu001C'}, U+001C FILE SEPARATOR.
     * <li> It is {@code '\u005Cu001D'}, U+001D GROUP SEPARATOR.
     * <li> It is {@code '\u005Cu001E'}, U+001E RECORD SEPARATOR.
     * <li> It is {@code '\u005Cu001F'}, U+001F UNIT SEPARATOR.
	 * @throws Exception
	 */
	public void testWhitespace() throws Exception {
		assertEquals(true, Character.isWhitespace('\n'));
		assertEquals(true, Character.isWhitespace('\t'));
		assertEquals(true, Character.isWhitespace(' '));
	}
}
