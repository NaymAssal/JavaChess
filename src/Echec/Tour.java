package Echec;

public class Tour extends Piece{

	public Tour(Joueur j, int x, int y) {
		super(j, x, y);
	}
	
	public void bouger(int x, int y) {
		
	}
	
	public String toString() {
		String str = "Tou";
		str += this.getJoueur().getCol();
		return str;
	}
}
