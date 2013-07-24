package pieces;

import java.util.ArrayList;
import java.util.Arrays;

public class Pieces {
	public final static String PLAYER_BLACK = "black";			
	public final static String PLAYER_WHITE = "white";			
	public final static String BLANK = "blank";		
	public final static String PAWN = "pawn";			
	public final static String ROOK = "rook";		
	public final static String KNIGHT = "knight";			
	public final static String BISHOP = "bishop";	
	public final static String QUEEN = "queen";	
	public final static String KING = "king";	
	
	private final static ArrayList<String> PLAYER_COLOR = new ArrayList<String>(Arrays.asList("black","white"));			
	private final static ArrayList<String> PIECE_KINDS = new ArrayList<String>(Arrays.asList("pawn","rook","knight","bishop","queen","king"));		
	private final static char EMPTY_EXPRESSION = '.';		
	
	private static int pieceCounter;
	
	private String playerColor;
	private String pieceKind;
	
	private Pieces(String playerColor,String pieceKind) {
		this.playerColor = playerColor;
		this.pieceKind = pieceKind;
	}	
	
	/**
	 * 플레이어색 String과 말종류 String을 받아 해당색의 말을 만드는 factory method
	 * Pieces.BLANK 클래스 상수를 팩토리 메소드의 인자로 넣고 빈 말을 생성할 수 있다.
	 * @param playerColor, pieceKind
	 */
	public static Pieces create(String playerColor,String pieceKind) {
		if(PLAYER_COLOR.contains(playerColor)&&PIECE_KINDS.contains(pieceKind)) {
			pieceCounter++;
			return new Pieces(playerColor,pieceKind);
		}
		else
			return new Pieces(BLANK,BLANK);
	}

	public static int getPieceCounter(){
		return pieceCounter;
	}
	
	/**
	 * @return 말의 색을 반환
	 */
	public String getPlayerColor() {
		return this.playerColor;
	}

	/**
	 * @return 말을 표현하는 문자를 반환
	 */
	public char getCharExpression() {
		String tempPieceKind;
		if(pieceKind=="knight") { 
			tempPieceKind = "night";						
		}
		else {
			tempPieceKind = pieceKind;			
		}
		
		char pieceInitial = tempPieceKind.charAt(0);
		if(playerColor==PLAYER_COLOR.get(0)) {
			return Character.toUpperCase(pieceInitial);
		} else if (playerColor==PLAYER_COLOR.get(1)) {
			return Character.toLowerCase(pieceInitial);
		} else 
			return EMPTY_EXPRESSION;
	}

	public boolean isWhite() {
		if(playerColor==Pieces.PLAYER_WHITE) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isBlack() {
		if(playerColor==Pieces.PLAYER_BLACK) {
			return true;
		} else {
			return false;
		}
	}
}
