package Echec;

import java.util.Iterator;

public class Plateau2 {

	private Joueur j1;
	private Joueur j2;
	private Piece[][] tab;
	
	public Plateau2(Joueur j1, Joueur j2) {
		this.j1 = j1;
		this.j2 = j2;
		tab = new Piece[8][8];
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				tab[i][j] = new CaseVide(i, j);
				
				
			}
		}
		
	}
	
	public void init() {
		
		
		for(int i=0; i<8; i++) {
			tab[1][i] = new Pion(j1, i, 1);
		}
		
		
		
		for(int i=0; i<8; i++) {
			tab[6][i] = new Pion(j2, i, 6);
		}
	}
	
	public void add(int x, int y, Piece a) {
		tab[x][y] = a;
		a.setCoo(x, y);
	}
	
	public String toString() {
		String str = "     ";
		for(int j=0; j<8; j++) {
			str += (char)(j+97) + "     ";
		}
		for(int i=0; i<8; i++) {
			str += "\n" + (8-i);
			for(int j=0; j<8; j++) {
				str += " |" + tab[i][j];
				
				
				
			}
			str += "\n";
		}
		
		return str;
	}
}
