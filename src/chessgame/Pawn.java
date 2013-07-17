package chessgame;

public class Pawn {
// static 이 왜 들어가나?
	final static String black = "black";
	final static String white = "white";
	
	String color;

	public Pawn(String color) {
		this.color = color;
	}

	public Pawn() {
		color = "white";
	}

	public String getColor() {

		return this.color;
	}

}
