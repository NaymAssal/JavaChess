package Echec;

public class Reine extends Piece{
	
	public Reine(Joueur j, int x, int y) {
		super(j, x, y);
	}
	
	public void bouger(int x, int y) {
			
		}
	
	public String toString() {
		String str = "Rei";
		str += this.getJoueur().getCol();
		return str;
	}
}
