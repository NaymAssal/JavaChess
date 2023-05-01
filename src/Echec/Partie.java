package Echec;

public class Partie {
	
	private Joueur j1;
	private Joueur j2;
	private Plateau2 plat;
	private boolean quiJoue;
	private int tour;
	
	public Partie(Joueur j1, Joueur j2) {
		this.j1 = j1;
		this.j2 = j2;
		plat = new Plateau2(j1, j2);
	}
}
