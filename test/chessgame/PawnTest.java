package chessgame;

import java.util.ArrayList;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testcreate() throws Exception {
		final String wPawnColor = "white";
		
		Pawn wPawn = new Pawn(wPawnColor);
		String myPawnColor = wPawn.getColor();
		assertEquals(wPawnColor, myPawnColor);
		
		final String bPawnColor = "black";
		
		Pawn bPawn = new Pawn(bPawnColor);
		System.out.println(bPawn.getColor());
		
	}
	
	public void testConstructorWithoutParameter() throws Exception {
		Pawn wPawn = new Pawn();
		String wPawnColor = wPawn.color;
		assertEquals("white", wPawnColor);
	}
	
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
