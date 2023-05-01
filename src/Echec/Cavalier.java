package Echec;

public class Cavalier extends Piece{
	
	public Cavalier(Joueur j, int x, int y) {
		super(j, x, y);
	}
	
	public void bouger(int x, int y) {
			
		}
	
	public String toString() {
		String str = "Cav";
		str += this.getJoueur().getCol();
		return str;
	}
}
