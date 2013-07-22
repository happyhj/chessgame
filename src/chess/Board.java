package chess;

import java.util.ArrayList;

import pieces.Pawn;

/**
 * 말이 올라가는 보드이다.
 * @author kimheejae + leegunhee
 */
public class Board {

//	private ArrayList<ArrayList<Pawn>> pawns = new ArrayList<ArrayList<Pawn>>();
	final static String NEWLINE = System.getProperty("line.separator");
	
	private ArrayList<Pawn> row0 = new ArrayList<Pawn>();
	private ArrayList<Pawn> row1 = new ArrayList<Pawn>();
	private ArrayList<Pawn> row2 = new ArrayList<Pawn>();
	private ArrayList<Pawn> row3 = new ArrayList<Pawn>();
	private ArrayList<Pawn> row4 = new ArrayList<Pawn>();
	private ArrayList<Pawn> row5 = new ArrayList<Pawn>();
	private ArrayList<Pawn> row6 = new ArrayList<Pawn>();
	private ArrayList<Pawn> row7 = new ArrayList<Pawn>();
	
	/**
	 * 인자로 받은 말을 말목록에 추가한다.
	 * 흰색 Pawn 이라면 두번쨰 줄에 추가하고
	 * 흑색 Pawn 이라면 여섯번쨰 줄에 추가하고
	 * @param aPawn
	 */
	public void addPawn(Pawn aPawn) {
		if(aPawn.getColor()==Pawn.WHITE) {
			row1.add(aPawn);
//			pawns.add(1,row1);
		} else if(aPawn.getColor()==Pawn.BLACK) {
			row6.add(aPawn);			
//			pawns.add(6,row6);
		} else {
			
		}
	}

	/**
	 * 보드에 추가한 말의 수를 반환한다.
	 * @return 말의 수
	 */
	public int getNumberOfPawns() {
		int pawnCount = 0;
		
		pawnCount = pawnCount + row0.size();
		pawnCount = pawnCount + row1.size();
		pawnCount = pawnCount + row2.size();
		pawnCount = pawnCount + row3.size();
		pawnCount = pawnCount + row4.size();
		pawnCount = pawnCount + row5.size();
		pawnCount = pawnCount + row6.size();
		pawnCount = pawnCount + row7.size();

		return pawnCount;
	}

	/**
	 * 지금 보드위에 올라가 있는 말의 목록을 반환한다.
	 * 모든줄의 원소를 차례로 하나로 합쳐서 반환한다.
	 * @return 말의 목록
	 */
	public ArrayList<Pawn> getPawnsList() {
		ArrayList<Pawn> allPawns = new ArrayList<Pawn>();
		allPawns.addAll(row0);
		allPawns.addAll(row1);
		allPawns.addAll(row2);
		allPawns.addAll(row3);
		allPawns.addAll(row4);
		allPawns.addAll(row5);
		allPawns.addAll(row6);
		allPawns.addAll(row7);
		return allPawns;
	}

	/**
	 * 	두번째줄과 일곱번째줄에 색을 맞춰 8개의 졸을 추가한다.
	 */
	public void initialize() {
		// TODO Auto-generated method stub
		// 라인시작번호는 0이다.
		for(int i=0;i<8;i++){
			row1.add(new Pawn(Pawn.WHITE));
			row6.add(new Pawn(Pawn.BLACK));
		}
		
		System.out.println(getBoardString());
	}

	/**
	 * 보드위의 말들을 문자열로 만들어준다.
	 * 보드초기화 작업 시 콘솔출력에 사용한다.
	 * @return
	 */
	public String getBoardString(){
		final String wPawnChar = "p";
		final String bPawnChar = "P";
		final String blankRow = "........";
		
		StringBuilder boardString = new StringBuilder();
		StringBuilder sbBlankRow = new StringBuilder(blankRow);
		StringBuilder sbNEWLINE = new StringBuilder(NEWLINE);

		if(row7.size()==0) {
			boardString.append(sbBlankRow);
			boardString.append(sbNEWLINE);
		} else {
			for(int i=0;i<8;i++) {
				if(row7.get(i).getColor()==Pawn.WHITE){
					boardString.append(wPawnChar);

				} else if(row7.get(i).getColor()==Pawn.BLACK) {
					boardString.append(bPawnChar);				
				}
			}
			boardString.append(sbNEWLINE);
		}
		
		if(row6.size()==0) {
			boardString.append(sbBlankRow);
			boardString.append(sbNEWLINE);
		} else {
			for(int i=0;i<8;i++) {
				if(row6.get(i).getColor()==Pawn.WHITE){
					boardString.append(wPawnChar);

				} else if(row6.get(i).getColor()==Pawn.BLACK) {
					boardString.append(bPawnChar);				
				}
			}
			boardString.append(sbNEWLINE);
		}		
		
		if(row5.size()==0) {
			boardString.append(sbBlankRow);
			boardString.append(sbNEWLINE);
		} else {
			for(int i=0;i<8;i++) {
				if(row5.get(i).getColor()==Pawn.WHITE){
					boardString.append(wPawnChar);

				} else if(row5.get(i).getColor()==Pawn.BLACK) {
					boardString.append(bPawnChar);				
				}
			}
			boardString.append(sbNEWLINE);
		}		
	
		if(row4.size()==0) {
			boardString.append(sbBlankRow);
			boardString.append(sbNEWLINE);
		} else {
			for(int i=0;i<8;i++) {
				if(row4.get(i).getColor()==Pawn.WHITE){
					boardString.append(wPawnChar);

				} else if(row4.get(i).getColor()==Pawn.BLACK) {
					boardString.append(bPawnChar);				
				}
			}
			boardString.append(sbNEWLINE);
		}		
		
		if(row3.size()==0) {
			boardString.append(sbBlankRow);
			boardString.append(sbNEWLINE);
		} else {
			for(int i=0;i<8;i++) {
				if(row3.get(i).getColor()==Pawn.WHITE){
					boardString.append(wPawnChar);

				} else if(row3.get(i).getColor()==Pawn.BLACK) {
					boardString.append(bPawnChar);				
				}
			}
			boardString.append(sbNEWLINE);
		}		
		
		if(row2.size()==0) {
			boardString.append(sbBlankRow);
			boardString.append(sbNEWLINE);
		} else {
			for(int i=0;i<8;i++) {
				if(row2.get(i).getColor()==Pawn.WHITE){
					boardString.append(wPawnChar);

				} else if(row2.get(i).getColor()==Pawn.BLACK) {
					boardString.append(bPawnChar);				
				}
			}
			boardString.append(sbNEWLINE);
		}		
		
		
		if(row1.size()==0) {
			boardString.append(sbBlankRow);
			boardString.append(sbNEWLINE);
		} else {
			for(int i=0;i<8;i++) {
				if(row1.get(i).getColor()==Pawn.WHITE){
					boardString.append(wPawnChar);

				} else if(row1.get(i).getColor()==Pawn.BLACK) {
					boardString.append(bPawnChar);				
				}
			}
			boardString.append(sbNEWLINE);
		}		
		
		if(row0.size()==0) {
			boardString.append(sbBlankRow);
		} else {
			for(int i=0;i<8;i++) {
				if(row0.get(i).getColor()==Pawn.WHITE){
					boardString.append(wPawnChar);

				} else if(row0.get(i).getColor()==Pawn.BLACK) {
					boardString.append(bPawnChar);				
				}
			}
		}	
		
		return boardString.toString();
	}
}
