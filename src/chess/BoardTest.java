package chess;

import java.util.ArrayList;

import pieces.Pawn;
import junit.framework.TestCase;
import static util.StringUtil.NEWLINE;

public class BoardTest extends TestCase {
	private Board myBoard;
	private Pawn wPawn;
	private Pawn bPawn;
	
	public void setUp() {
		myBoard = new Board();
		bPawn = new Pawn(Pawn.BLACK);		
		wPawn = new Pawn(Pawn.WHITE);		
	}
	
	/**
	 * 보드에 초기화 시 들어간 졸의 수를 받아온다.
	 * @throws Exception
	 */
	public void testBoardClass() throws Exception {
		assertEquals(16, myBoard.getNumberOfPawns());
	}
	
	/**
	 * 생성자를 통해 동적으로 생성된 Pawn 인스턴스를 추가하므로 
	 * 동일한 속성값을 지닌 Pawn을 지녔냐고 물어도
	 * 레퍼런스가 없으므로 false를 반납한다.
	 * @throws Exception
	 */
	public void testGetPawnsList() throws Exception {	
		Pawn bPawn2 = new Pawn(Pawn.BLACK);	
		
		ArrayList<Pawn> pawnList = myBoard.getPawnsList();
		assertEquals(false,pawnList.contains(wPawn));
		assertEquals(false,pawnList.contains(bPawn));
		assertEquals(false,pawnList.contains(bPawn2));
	}
	
	/**
	 * 체스보드의 상황을 보여주는 문자열을 받아온다.
	 * @throws Exception
	 */
	public void testInitAndBoardString() throws Exception {
		String test = "";
		test = test + "........"+NEWLINE;
		test = test + "PPPPPPPP"+NEWLINE;
		test = test + "........"+NEWLINE;
		test = test + "........"+NEWLINE;
		test = test + "........"+NEWLINE;
		test = test + "........"+NEWLINE;
		test = test + "pppppppp"+NEWLINE;
		test = test + "........"+NEWLINE;
			
		assertEquals(test, myBoard.getBoardString());
	}
}
