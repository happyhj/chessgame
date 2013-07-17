package chessgame;

public class Pawn {
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
