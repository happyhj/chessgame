package chess;

import util.StringUtil;
import junit.framework.TestCase;


public class BoardTest extends TestCase {
	private Board board;
	
	public void setUp() {
		board = new Board();
	}

	public void testCreate() throws Exception {
		assertEquals(32, board.getNumberOfPieces());
		String blankRank = StringUtil.appendNewline("........");
		assertEquals(
				StringUtil.appendNewline("RNBQKBNR") +
				StringUtil.appendNewline("PPPPPPPP") +
				blankRank + blankRank + blankRank + blankRank +
				StringUtil.appendNewline("pppppppp") +
				StringUtil.appendNewline("rnbqkbnr")
				, board.print());
	}
}
