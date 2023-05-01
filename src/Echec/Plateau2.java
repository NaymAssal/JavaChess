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
			tab[6][i] = new Pion(j1, 6, i);
		}
		tab[7][0] = new Tour(j1, 7, 0);
		tab[7][7] = new Tour(j1, 7, 7);
		tab[7][1] = new Cavalier(j1, 7, 1);
		tab[7][6] = new Cavalier(j1, 7, 6);
		tab[7][2] = new Fou(j1, 7, 2);
		tab[7][5] = new Fou(j1, 7, 5);
		tab[7][3] = new Reine(j1, 7, 3);
		Piece r1 = new Roi(j1, 7, 4);
		tab[7][4] = r1;
		j1.setRoi(r1);
		
		
		
		for(int i=0; i<8; i++) {
			tab[1][i] = new Pion(j2, 1, i);
		}
		tab[0][0] = new Tour(j2, 0, 0);
		tab[0][7] = new Tour(j2, 0, 7);
		tab[0][1] = new Cavalier(j2, 0, 1);
		tab[0][6] = new Cavalier(j2, 0, 6);
		tab[0][2] = new Fou(j2, 0, 2);
		tab[0][5] = new Fou(j2, 0, 5);
		tab[0][4] = new Reine(j2, 0, 4);
		Piece r2 = new Roi(j2, 0, 3);
		tab[0][3] = r2;
		j2.setRoi(r2);
	}
	
	public void add(int x, int y, Piece a) {
		tab[x][y] = a;
		a.setCoo(x, y);
	}
	
	public Piece[][] getTab() {
		return tab;
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
