package pieces;

import junit.framework.TestCase;

public class PiecesTest extends TestCase {

	public void testCreate() throws Exception {	
		Pieces myPawn = Pieces.create(Pieces.PLAYER_WHITE,Pieces.PAWN);
		assertEquals(Pieces.PLAYER_WHITE, myPawn.getPlayerColor());
		myPawn = Pieces.create(Pieces.PLAYER_BLACK,Pieces.PAWN);
		assertEquals(Pieces.PLAYER_BLACK, myPawn.getPlayerColor());
	}
	
	public void testBlankPiece() throws Exception {
		assertEquals("blank", Pieces.create(Pieces.BLANK,Pieces.BLANK).getPlayerColor());
		assertEquals('.',Pieces.create(Pieces.BLANK,Pieces.BLANK).getCharExpression());
	}
	
	public void testPieceCharExpression() throws Exception {
		assertEquals('.',Pieces.create(Pieces.BLANK,Pieces.BLANK).getCharExpression());
		assertEquals('p',Pieces.create(Pieces.PLAYER_WHITE,Pieces.PAWN).getCharExpression());
		assertEquals('P',Pieces.create(Pieces.PLAYER_BLACK,Pieces.PAWN).getCharExpression());
		assertEquals('B',Pieces.create(Pieces.PLAYER_BLACK,Pieces.BISHOP).getCharExpression());
		assertEquals('n',Pieces.create(Pieces.PLAYER_WHITE,Pieces.KNIGHT).getCharExpression());
	}
	
	public void testBlackOrWhite() throws Exception {
		Pieces bKing = Pieces.create(Pieces.PLAYER_BLACK, Pieces.KING);
		Pieces wQueen = Pieces.create(Pieces.PLAYER_WHITE, Pieces.QUEEN);
		assertEquals(false, bKing.isWhite());
		assertEquals(false, wQueen.isBlack());
	}
}
