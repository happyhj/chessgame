package chessgame;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testcreate() throws Exception {
		Pawn myPawn = new Pawn("white");
		String myPawnColor = myPawn.getColor();
		assertEquals("white", myPawnColor);
		
		Pawn blackPawn = new Pawn("black");
		System.out.println(blackPawn.getColor());
		
	}
}
