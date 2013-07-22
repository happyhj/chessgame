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
		bPawn = new Pawn(Pawn.BLACK);		
		wPawn = new Pawn(Pawn.WHITE);		
	}
	
	public void testBoardClass() throws Exception {
		assertEquals(0, myBoard.getNumberOfPawns());
		myBoard.addPawn(wPawn);
		assertEquals(1, myBoard.getNumberOfPawns());
		myBoard.addPawn(bPawn);
		assertEquals(2, myBoard.getNumberOfPawns());
	}
	public void testGetPawnsList() throws Exception {	
		Pawn bPawn2 = new Pawn(Pawn.BLACK);	

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
		for(int i=0;i<8;i++) {
			assertEquals(false,pawnList.contains(num1));
		}
	}
	
	public void testCreate() throws Exception {
		myBoard.initialize();
		String test = "";
		test = test + "........"+Board.NEWLINE;
		test = test + "PPPPPPPP"+Board.NEWLINE;
		test = test + "........"+Board.NEWLINE;
		test = test + "........"+Board.NEWLINE;
		test = test + "........"+Board.NEWLINE;
		test = test + "........"+Board.NEWLINE;
		test = test + "pppppppp"+Board.NEWLINE;
		test = test + "........";
			
		assertEquals(test, myBoard.getBoardString());
	}
}
