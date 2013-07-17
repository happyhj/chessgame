package chess;

import java.util.ArrayList;

import pieces.Pawn;
import junit.framework.TestCase;

public class BoardTest extends TestCase {
	private Board myBoard;
	private Pawn wPawn;
	private Pawn bPawn;
	
	public void setUp() {
		myBoard = new Board();
		bPawn = new Pawn(Pawn.black);		
		wPawn = new Pawn(Pawn.white);		
	}
	
	public void testBoardClass() throws Exception {
		assertEquals(0, myBoard.getNumberOfPawns());
		myBoard.addPawn(wPawn);
		assertEquals(1, myBoard.getNumberOfPawns());
		myBoard.addPawn(bPawn);
		assertEquals(2, myBoard.getNumberOfPawns());
	}
	public void testGetPawnsList() throws Exception {	
		Pawn bPawn2 = new Pawn(Pawn.black);	

		myBoard.addPawn(wPawn);
		myBoard.addPawn(bPawn);
		ArrayList<Pawn> pawnList = myBoard.getPawnsList();
		assertEquals(true,pawnList.contains(wPawn));
		assertEquals(true,pawnList.contains(bPawn));
		assertEquals(false,pawnList.contains(bPawn2));
	}
	public void testAddOnlyPawns() throws Exception {
		Integer num1 = new Integer("7");	

		myBoard.addPawn(wPawn);
		myBoard.addPawn(bPawn);	
		ArrayList<Pawn> pawnList = myBoard.getPawnsList();
		assertEquals(false,pawnList.contains(num1));
		
	}
}
