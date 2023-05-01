package Echec;

public class Joueur {
	private String name;
	private boolean couleur;
	
	public Joueur(String name, boolean couleur) {
		this.name = name;
		this.couleur = couleur;
	}
	
	public String getCol() {
		if(couleur) {
			return "B";
		}
		return "N";
	}
}
