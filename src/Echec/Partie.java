package Echec;

import java.util.Scanner;

public class Partie {
	
	private Joueur j1;
	private Joueur j2;
	private Plateau2 plat;
	private Joueur quiJoue;
	private int tour;
	
	public Partie(Joueur j1, Joueur j2) {
		this.j1 = j1;
		this.j2 = j2;
		plat = new Plateau2(j1, j2);
		tour = 1;
		quiJoue = j1;
		
	}
	
	public void lancerUnePartie() {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[2];
		int[] b = new int[2];
		boolean cond;
		plat.init();
		System.out.println("Bienvenue sur JavaChess !");
		String name;
		System.out.println("Veuillez entrer le nom du Joueur 1:");
		name = scan.nextLine();
		j1.setNom(name);
		System.out.println("Veuillez entrer le nom du Joueur 2:");
		name = scan.nextLine();
		j2.setNom(name);
		

		
		
		while(j1.getRoi().getAlive() && j2.getRoi().getAlive()) {
			System.out.println("Tour " + tour);
			System.out.println(plat);
			System.out.println("Tour de : " + quiJoue.getNom());
			cond = true;
			while(cond) {
				System.out.println("Choisissez une pièce :");
				name = scan.nextLine();
				a = this.selectionner(name);
				if(a == null) {
					System.out.println("Case incorrecte");
				}
				else if(plat.getTab()[a[1]][a[0]].getJoueur() != quiJoue){
					System.out.println("Mauvais joueur");
				}
				else {
					cond = false;
				}
				
			}
			
			System.out.println("Choisissez une case :");
			name = scan.nextLine();
			b = this.selectionner(name);
			if(b == null) continue;
			if(!this.caseAccessible(a, b)) {
				System.out.println("Casse inaccessible");
				continue;
			}
			cond = jouer(quiJoue, a[0], a[1], b[0], b[1]);
			if(!cond) continue;
			if(quiJoue == j1) {
				quiJoue = j2;
			}
			else {
				quiJoue = j1;
			}
			tour++;
			
			
		}
		
		
	}
	

	public boolean caseAccessible(int[] p, int[] c) {
		return false;
	}
	
	public boolean jouer(Joueur j, int xp, int yp, int xa, int ya) {
		if(plat.getTab()[xp][yp].getJoueur() != j ) {
			
			return false;
		}
		else {
			plat.getTab()[xa][ya] = plat.getTab()[xp][yp];
			plat.getTab()[xp][yp] = new CaseVide(xp,yp);
			return true;
		}
		
	}
	
	public int[] selectionner(String p) {
		int[] a = new int[2];
		char b1 = (char)p.charAt(0);
		int a1 = (int)b1;
		char b2 = (char)p.charAt(1);
		int a2 = (int)b2;
		if(a1<97 || a1>104 || a2<49 || a2>56) {
			return null;
		}
		else {
			a[0] = 7 - (a2-49);
			a[1] = a1 - 97;
			return a;
		}
	}
}
