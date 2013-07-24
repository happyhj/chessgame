package chess;

import junit.framework.TestCase;
import pieces.Pieces;

public class RowTest extends TestCase {
	private Row eRow;
	private Row wRow;
	private Row bRow;
	
	@Override
	protected void setUp() throws Exception {
		eRow = Row.createBlankRow();
		wRow = Row.createPawnRow(Pieces.PLAYER_WHITE);
		bRow = Row.createPawnRow(Pieces.PLAYER_BLACK);
	}
	
	public void testRowExpression() throws Exception {
		assertEquals("........", eRow.getRowExpression());
		assertEquals("pppppppp", wRow.getRowExpression());
		assertEquals("PPPPPPPP", bRow.getRowExpression());
		assertEquals("RNBQKBNR", Row.createBaseRow(Pieces.PLAYER_BLACK).getRowExpression());
	}
}
