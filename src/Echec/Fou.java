package Echec;

public class Fou extends Piece{
	
	public Fou(Joueur j, int x, int y) {
		super(j, x, y);
	}
	
	public void bouger(int x, int y) {
		
	}
	
	public String toString() {
		String str = "Fou";
		str += this.getJoueur().getCol();
		return str;
	}
}
