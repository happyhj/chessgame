package chess;

import java.util.ArrayList;
import java.util.Collection;

import pieces.Pawn;

public class Row {
	
	static final int numberOfElementsInRow = 8;
	private ArrayList<Pawn> pawns = new ArrayList<Pawn>();
	private int pawnCount;
	
	Row() {
		initializeWithPawns();
	}
	
	Row(String color) {
		if((color==Pawn.BLACK)||(color==Pawn.WHITE))
			initializeWithPawns(color);
		else
			initializeWithPawns();
	}
	
	private void initializeWithPawns() {
		for (int i=0;i<numberOfElementsInRow;i++) {
			pawns.add(new Pawn(Pawn.EMPTY));
		}
	}

	private void initializeWithPawns(String Color) {
		for (int i=0;i<numberOfElementsInRow;i++) {
			pawns.add(new Pawn(Color));
			pawnCount++;
		}
	}
	
	public int getNumberOfPawns() {
		return pawnCount;
	}
	
	public String getRowExpression() {
		StringBuilder builer = new StringBuilder();		
		for (int i=0;i<numberOfElementsInRow;i++) {
		    builer.append(pawns.get(i).getTag());
		}
		return builer.toString();
	}

	public ArrayList<Pawn> getPawnList() {
		return pawns;
	}
	
}
