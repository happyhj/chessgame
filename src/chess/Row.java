package chess;

import java.util.ArrayList;
import java.util.Arrays;
import pieces.Pieces;

public class Row {
	private final static ArrayList<String> SETUP_BASEORDER = new ArrayList<String>(Arrays.asList("rook","knight","bishop","queen","king","bishop","knight","rook"));		

	static final int numberOfElementsInRow = 8;
	private ArrayList<Pieces> pieces = new ArrayList<Pieces>();
	
	private Row() {}
	
	/**
	 * @param playerColor
	 * @return  폰으로 모두 채워진 열을 반환한다.
	 */
	public static Row createPawnRow(String playerColor) {
		Row pawnRow = new Row();
		pawnRow.initializeWithPawns(playerColor);
		return pawnRow;	
	}
	private void initializeWithPawns(String playerColor) {
		for (int i=0;i<numberOfElementsInRow;i++) {
			pieces.add(Pieces.create(playerColor,Pieces.PAWN));
		}
	}
	
	/**
	 * @return Blank Piece로 채워진 열을 반환한다.
	 */
	public static Row createBlankRow() {
		Row blankRow = new Row();
		blankRow.initializeWithBlank();
		return blankRow;		
	}
	private void initializeWithBlank() {
		for (int i=0;i<numberOfElementsInRow;i++) {
			pieces.add(Pieces.create(Pieces.BLANK,Pieces.BLANK));
		}
	}
	
	/**
	 * @param playerColor
	 * @return  첫번쨰열의 기본 시작셋업으로 모두 채워진 열을 반환한다.
	 */
	public static Row createBaseRow(String playerColor) {
		Row baseRow = new Row();
		baseRow.initializeWithBases(playerColor);
		return baseRow;		
	}
	private void initializeWithBases(String playerColor) {
		for (String pieceKind : SETUP_BASEORDER) {
			pieces.add(Pieces.create(playerColor,pieceKind));
		}
	}
	
	/**
	 * @return 열의 내용을 문자열로 반환한다.
	 */
	public String getRowExpression() {
		StringBuilder builer = new StringBuilder();		
		for (Pieces piece: pieces) {
		    builer.append(piece.getCharExpression());
		}
		return builer.toString();
	}

	/**
	 * @return 열의 내용을 Piece 인스턴스의 ArrayList객체로 반환한다.
	 */
	public ArrayList<Pieces> getPiecesList() {
		return pieces;
	}
	
}
