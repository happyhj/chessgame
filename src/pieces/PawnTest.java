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
//		System.out.println(bPawn.getColor());
		
	}
	
	public void testConstructorWithoutParameter() throws Exception {
		Pawn wPawn = new Pawn();
		String wPawnColor = wPawn.color;
		assertEquals("white", wPawnColor);
	}
	
	/**
	 * 연습문제 3-3
	 * pawn의 색에 따라 P나 p를 반환하는 print 인스턴스 메서드를 만들어 주었다. ^^*
	 * @throws Exception
	 */
	public void testPrintPawnExpression() throws Exception {
		Pawn wPawn = new Pawn();
		System.out.println(wPawn.print());
	}
}
