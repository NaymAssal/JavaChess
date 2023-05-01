package Echec;

public class Pion extends Piece {
	
	public Pion (Joueur j, int x, int y) {
		super(j, x, y);
	}
	
	public void bouger(int x, int y) {
		
	}
	
	public String toString() {
		String str = "Pio";
		str += this.getJoueur().getCol();
		return str;
	}
}
