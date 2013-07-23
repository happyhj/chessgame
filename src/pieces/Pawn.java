package pieces;

/**
 * 두 색을 가진 말이다.
 * @author kimheejae
 */
public class Pawn {

	public final static String BLACK = "black";
	public final static String WHITE = "white";
	public final static String EMPTY = "empty";
	
	private String color;
	private char tag;
	
	/**
	 * 색 문자열을 받아 해당색의 말을 만드는 생성자
	 * @param color
	 */
	public Pawn(String color) {
		this.color = color;
		if(color == BLACK) {
			tag = 'P';
		} else if(color == WHITE) {
			tag = 'p';
		} else if(color == EMPTY) {
			tag = '.';
		} else {
			System.out.println("올바른 인자가 아닙니다.(black,white,empty 중 하나) Empty Pawn을 생성합니다.");
			tag = '.';
		}
	}

	/**
	 * 기본으로 빈 폰을 생성하는 생성자
	 */
	public Pawn() {
		color = EMPTY;
		tag = '.';
	}

	/**
	 * @return 말의 색을 반환
	 */
	public String getColor() {

		return this.color;
	}

	public char getTag() {
		if(color==BLACK) {
			return 'P';
		} else if (color==WHITE) {
			return 'p';
		} else if (color==EMPTY) {
			return '.';
		} else 
			return '.';
	}

}
