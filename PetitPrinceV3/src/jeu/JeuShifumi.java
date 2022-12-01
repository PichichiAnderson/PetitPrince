package jeu;

import java.util.Random;

public class JeuShifumi extends JeuSimple {

	@Override
	public int arbitrer(String c1, String c2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String jouerUnTour() {
		Random r = new Random();
		String tirage;
		return Shifumi.getIndice(r.nextInt(3));
		 
	}

	
	public JeuShifumi() {
		this.nom = "Jeu du Shifumi";
	}
	
	
}
