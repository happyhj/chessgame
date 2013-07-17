package chess;

import java.util.ArrayList;

import pieces.Pawn;
import junit.framework.TestCase;

public class BoardTest extends TestCase {

	public void testBoardClass() throws Exception {
		Board myBoard = new Board();

		Pawn wPawn = new Pawn(Pawn.white);		
		Pawn bPawn = new Pawn(Pawn.black);	
		assertEquals(0, myBoard.getNumberOfPawns());
		myBoard.addPawn(wPawn);
		assertEquals(1, myBoard.getNumberOfPawns());
		myBoard.addPawn(bPawn);
		assertEquals(2, myBoard.getNumberOfPawns());
	}
	public void testGetPawnsList() throws Exception {
		Board myBoard = new Board();
		Pawn wPawn = new Pawn(Pawn.white);		
		Pawn bPawn = new Pawn(Pawn.black);	
		Pawn bPawn2 = new Pawn(Pawn.black);	

		myBoard.addPawn(wPawn);
		myBoard.addPawn(bPawn);
		ArrayList<Pawn> pawnList = myBoard.getPawnsList();
		assertEquals(true,pawnList.contains(wPawn));
		assertEquals(true,pawnList.contains(bPawn));
		assertEquals(false,pawnList.contains(bPawn2));
	}
}
