package chessgame;

import java.util.ArrayList;

public class Board {

	private ArrayList<Pawn> pawns = new ArrayList<Pawn>();

	public void addPawn(Pawn aPawn) {
		pawns.add(aPawn);
	}

	public int getNumberOfPawns() {
		return pawns.size();
	}

	public ArrayList<Pawn> getPawnsList() {
		return pawns;
	}
	
}
