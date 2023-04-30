package Echec;

public class Piece {
	
	private String name;
	private boolean couleur;
	private int x;
	private int y;
	private boolean isAlive;
	
	public Piece(String name, boolean couleur, int x, int y) {
		this.couleur = couleur;
		this.x = x;
		this.y = y;
		isAlive = true;
	}
	
	
	public void bouger(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void manger(Piece p) {
		p.isAlive = False;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
