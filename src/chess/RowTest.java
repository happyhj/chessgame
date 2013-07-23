package chess;

import junit.framework.TestCase;
import pieces.Pawn;

public class RowTest extends TestCase {
	private Row eRow;
	private Row wRow;
	private Row bRow;
	
	@Override
	protected void setUp() throws Exception {
		eRow = new Row();
		wRow = new Row(Pawn.WHITE);
		bRow = new Row(Pawn.BLACK);
	}

	/**
	 * Row 클래스의 인자를 넣은
	 * 
	 * @throws Exception
	 */
	public void testInitialize() throws Exception {
		assertEquals(0, eRow.getNumberOfPawns());
		assertEquals(8, wRow.getNumberOfPawns());
		assertEquals(8, bRow.getNumberOfPawns());
	}
	
	public void testRowExpression() throws Exception {
		assertEquals("........", eRow.getRowExpression());
		assertEquals("pppppppp", wRow.getRowExpression());
		assertEquals("PPPPPPPP", bRow.getRowExpression());
	}
}
