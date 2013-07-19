package pieces;

/**
 * 두 색을 가진 말이다.
 * @author kimheejae
 */
public class Pawn {

	public final static String BLACK = "black";
	public final static String WHITE = "white";
	
	String color;
	
	/**
	 * 색 문자열을 받아 해당색의 말을 만드는 생성자
	 * @param color
	 */
	public Pawn(String color) {
		this.color = color;
	}

	/**
	 * 기본으로 흰색말을 생성하는 생성자
	 */
	public Pawn() {
		color = "white";
	}

	/**
	 * @return 말의 색을 반환
	 */
	public String getColor() {

		return this.color;
	}

	public char print() {
		if(color==BLACK) {
			return 'P';
		} else if (color==WHITE) {
			return 'p';
		}
		return '.';
	}

}
