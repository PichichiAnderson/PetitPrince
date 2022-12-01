package jeu;

import java.util.Random;

public class jeuDe extends JeuSimple {

	@Override
	public int arbitrer(String c1, String c2) {
		int premier, deuxieme;
		premier = Integer.valueOf(c1);
		deuxieme = Integer.valueOf(c2);
		
		if (premier < deuxieme) {
			return 1;
		}
		else if (premier > deuxieme) {
			return -1;
		}
		else {
			return 0;
		}
		
	}

	@Override
	public String jouerUnTour() {
		Random r = new Random();
		String c1 = String.valueOf(r.nextInt(1, 7));
		return c1;
	}

	public jeuDe() {
		this.nom = "Jeu de dé";
	}
	
}
