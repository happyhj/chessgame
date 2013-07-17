package chess;

import java.util.ArrayList;

/**
 * 말이 올라가는 보드이다.
 * @author kimheejae
 */
public class Board {

	private ArrayList<Pawn> pawns = new ArrayList<Pawn>();
	
	/**
	 * 인자로 받은 말을 말목록에 추가한다.
	 * @param aPawn
	 */
	public void addPawn(Pawn aPawn) {
		pawns.add(aPawn);
	}

	/**
	 * 보드에 추가한 말의 수를 반환한다.
	 * @return 말의 수
	 */
	public int getNumberOfPawns() {
		return pawns.size();
	}

	/**
	 * 지금 보드위에 올라가 있는 말의 목록을 반환한다.
	 * @return 말의 목록
	 */
	public ArrayList<Pawn> getPawnsList() {
		return pawns;
	}
	
}
