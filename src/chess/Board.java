package chess;

import java.util.ArrayList;

import pieces.Pawn;

/**
 * 말이 올라가는 보드이다.
 * @author kimheejae + leegunhee
 */
public class Board {

//	private ArrayList<ArrayList<Pawn>> pawns = new ArrayList<ArrayList<Pawn>>();
	final static String NEWLINE = System.getProperty("line.separator");
	final static int numberOfRowInBoard = 8;
	private ArrayList<Row> board = new ArrayList<Row>();
	
	
	
	public Board() {
		initialize();
	}
	
	/**
	 * 보드에 추가한 말의 수를 반환한다.
	 * @return 말의 수
	 */
	public int getNumberOfPawns() {
		int pawnCount = 0;
		for(Row aRow : board) {
			pawnCount += aRow.getNumberOfPawns();
		}
		return pawnCount;
	}

	/**
	 * 지금 보드위에 올라가 있는 말의 목록을 반환한다.
	 * 모든줄의 원소를 차례로 하나로 합쳐서 반환한다.
	 * @return 말의 목록
	 */
	public ArrayList<Pawn> getPawnsList() {
		ArrayList<Pawn> allPawns = new ArrayList<Pawn>();
		for(Row aRow : board) {
			allPawns.addAll(aRow.getPawnList());
		}
		return allPawns;
	}

	/**
	 * 	두번째줄과 일곱번째줄에 색을 맞춰 8개의 졸을 추가한다.
	 */
	public void initialize() {
		// 라인시작번호는 0이다.
		for(int i=0;i<numberOfRowInBoard;i++){
			if(i==1) {
				board.add(new Row(Pawn.WHITE));
				continue;
			}
			if(i==(numberOfRowInBoard-2)) {
				board.add(new Row(Pawn.BLACK));
				continue;
			}
			board.add(new Row());
		}
		System.out.println(getBoardString());
	}

	/**
	 * 보드위의 말들을 문자열로 만들어준다.
	 * 보드초기화 작업 시 콘솔출력에 사용한다.
	 * @return
	 */
	public String getBoardString(){	
		StringBuilder boardString = new StringBuilder();
		StringBuilder sbNEWLINE = new StringBuilder(NEWLINE);

		for(int i=Row.numberOfElementsInRow-1;i>=0;i--) {
			boardString.append(board.get(i).getRowExpression());
			boardString.append(sbNEWLINE);
		}

		return boardString.toString();
	}
}
