package pieces;

import junit.framework.TestCase;

public class PiecesTest extends TestCase {

	public void testCreate() throws Exception {	
		Pieces myPawn = Pieces.create(Pieces.PLAYER_WHITE,Pieces.PAWN);
		assertEquals(Pieces.PLAYER_WHITE, myPawn.getPlayerColor());
		myPawn = Pieces.create(Pieces.PLAYER_BLACK,Pieces.PAWN);
		assertEquals(Pieces.PLAYER_BLACK, myPawn.getPlayerColor());
	}
		
	/**
	 * Pieces.BLANK 클래스 상수를 팩토리 메소드의 인자로 넣고 빈 말을 생성한다.
	 * @throws Exception
	 */
	public void testBlankPieces() throws Exception {
		assertEquals("blank", Pieces.create(Pieces.BLANK,Pieces.BLANK).getPlayerColor());
		assertEquals('.',Pieces.create(Pieces.BLANK,Pieces.BLANK).getCharExpression());
	}
	
	/**
	 * 연습문제 3-3
	 * pawn의 색에 따라 P나 p를 반환하는 print 인스턴스 메서드를 만들어 주었다.
	 * @throws Exception
	 */
	public void testPrintPawnExpression() throws Exception {
		assertEquals('.',Pieces.create(Pieces.BLANK,Pieces.BLANK).getCharExpression());
		assertEquals('p',Pieces.create(Pieces.PLAYER_WHITE,Pieces.PAWN).getCharExpression());
		assertEquals('P',Pieces.create(Pieces.PLAYER_BLACK,Pieces.PAWN).getCharExpression());
	}
	
}
