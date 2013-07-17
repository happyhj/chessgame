package chessgame;

public class Pawn {
	final String black = "black";
	final String white = "white";
	
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
