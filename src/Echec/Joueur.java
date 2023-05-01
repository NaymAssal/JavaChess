package Echec;

public class Joueur {
	private String name;
	private boolean couleur;
	private Piece roi;
	
	public Joueur(String name, boolean couleur) {
		this.name = name;
		this.couleur = couleur;
	}
	
	public Joueur(boolean couleur) {
		this.couleur = couleur;
	}
	
	public void setNom(String name) {
		this.name = name;
	}
	
	public void setRoi(Piece roi) {
		this.roi = roi;
	}
	
	public Piece getRoi() {
		return roi;
	}
	public String getNom() {
		return name;
	}
	
	public String getCol() {
		if(couleur) {
			return "B";
		}
		return "N";
	}
	
}
