package pieces;

import java.util.ArrayList;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {	
		Pawn myPawn = new Pawn(Pawn.WHITE);
		assertEquals(Pawn.WHITE, myPawn.getColor());
		myPawn = new Pawn(Pawn.BLACK);	
		assertEquals(Pawn.BLACK, myPawn.getColor());
	}
	
	/**
	 * 처음에는 인자없는 생성자가 흰색폰을 생성하게 하였지만 
	 * 나중에 empty 폰이 필요해 졌으므로 인자없이 생성 시 "empty" 색을 가진 폰이 생성되도록 하였다.
	 * @throws Exception
	 */
	public void testConstructorWithoutParameter() throws Exception {
		assertEquals("empty", new Pawn().getColor());
		assertEquals('.', new Pawn().getTag());
	}
	
	/**
	 * 연습문제 3-3
	 * pawn의 색에 따라 P나 p를 반환하는 print 인스턴스 메서드를 만들어 주었다. ^^*
	 * @throws Exception
	 */
	public void testPrintPawnExpression() throws Exception {
		assertEquals('.',new Pawn().getTag());
		assertEquals('p',new Pawn(Pawn.WHITE).getTag());
		assertEquals('P',new Pawn(Pawn.BLACK).getTag());
	}

}
