package jeu;

public enum Shifumi {

	PIERRE("pierre"),
	FEUILLE("feuille"),
	CISEAU("ciseau");

	private String nom;
	
	Shifumi(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return this.nom;
	}
	
	public static String getIndice(int i) {
		Shifumi[] tab =Shifumi.values();
		return tab[i].toString();
	}
	
}
