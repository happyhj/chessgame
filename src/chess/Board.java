package chess;

import java.util.ArrayList;

import pieces.Pieces;
import util.StringUtil;

/**
 * 말이 올라가는 보드이다.
 * @author kimheejae
 */
public class Board {

	static final int numberOfRowsInBoard = 8;
	private ArrayList<Row> board = new ArrayList<Row>();	
	
	public Board() {
		initialize();
	}
	
	/**
	 * 보드에 추가한 말의 수를 반환한다.
	 * @return 말의 수
	 */
	public int getNumberOfPieces() {
		return 	Pieces.getPieceCounter();
	}

	/**
	 * 지금 보드위에 올라가 있는 말의 목록을 반환한다.
	 * 모든줄의 원소를 차례로 하나로 합쳐서 반환한다.
	 * @return 말의 목록
	 */
	public ArrayList<Pieces> getPiecesList() {
		ArrayList<Pieces> allPawns = new ArrayList<Pieces>();
		for(Row aRow : board) {
			allPawns.addAll(aRow.getPiecesList());
		}
		return allPawns;
	}

	/**
	 * 	두번째줄과 일곱번째줄에 색을 맞춰 8개의 졸을 추가한다.
	 */
	public void initialize() {
		board.add(Row.createBaseRow(Pieces.PLAYER_WHITE));
		board.add(Row.createPawnRow(Pieces.PLAYER_WHITE));
		for(int i=0;i<numberOfRowsInBoard-4;i++){
			board.add(Row.createBlankRow());
		}
		board.add(Row.createPawnRow(Pieces.PLAYER_BLACK));		
		board.add(Row.createBaseRow(Pieces.PLAYER_BLACK));
		
		System.out.println(print());
	}

	/**
	 * 보드위의 말들을 문자열로 만들어준다.
	 * 보드초기화 작업 시 콘솔출력에 사용한다.
	 * @return
	 */
	public String print(){	
		StringBuilder boardString = new StringBuilder();
		StringBuilder sbNEWLINE = new StringBuilder(StringUtil.NEWLINE);

		for(int i=Row.numberOfElementsInRow-1;i>=0;i--) {
			boardString.append(board.get(i).getRowExpression());
			boardString.append(sbNEWLINE);
		}

		return boardString.toString();
	}
}
