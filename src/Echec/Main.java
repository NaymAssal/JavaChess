package Echec;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Joueur j1 = new Joueur("j1", false);
		Joueur j2 = new Joueur("j2", true);
		Plateau2 a = new Plateau2(j1, j2);
		
		
		Partie g = new Partie(j1, j2);
		
		g.lancerUnePartie();
		
	
		
	}

}
