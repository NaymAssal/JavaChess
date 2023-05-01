package Echec;

public abstract class Piece {
	
	private String name;
	private Joueur j;
	private int x;
	private int y;
	private boolean isAlive;
	
	public Piece(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public Piece(String name, Joueur j, int x, int y) {
		this.name = name;
		this.j = j;
		this.x = x;
		this.y = y;
		isAlive = true;
	}
	
	public Piece(Joueur j, int x, int y) {
		this.j = j;
		this.x = x;
		this.y = y;
		isAlive = true;
	}
	
	
	public abstract void bouger(int x, int y);
	
	public void setCoo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void manger(Piece p) {
		p.isAlive = false;
	}
	
	public String getNom() {
		return name;
	}
	
	public Joueur getJoueur() {
		return j;
	}
	
	@Override
	public String toString() {
		if(name == null) {
			return "    ";
		}
		return name + j.getCol();
	}
	
}
