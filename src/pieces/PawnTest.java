package pieces;

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
}
