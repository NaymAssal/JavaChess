package Echec;

public class Roi extends Piece{
	
	public Roi(Joueur j, int x, int y) {
		super(j, x, y);
	}
	
	public void bouger(int x, int y) {
			
		}
	
	public String toString() {
		String str = "Roi";
		str += this.getJoueur().getCol();
		return str;
	}
}
