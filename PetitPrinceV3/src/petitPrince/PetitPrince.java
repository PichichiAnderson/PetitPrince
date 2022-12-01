package petitPrince;

import asteroide.Sujet;
import asteroide.console.*;

public class PetitPrince implements Sujet{

	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt = 0;
	
	public PetitPrince(String nom) {
		this.argent = 0;
		this.console = new ConsoleJavaBoy(this);
		this.nom = nom;
		
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public int getArgent() {
		return this.argent;
	}

	@Override
	public void run() {
		this.console.parler("Bonjour, je suis "+this.getNom()+"!");
		this.console.parler("C'est mon tour "+this.cpt);
		cpt++;
		
	}
	
	public static void Main(String[] argc) {
		PetitPrince p = new PetitPrince("Raphaël");
		p.run();
	}
	
}
