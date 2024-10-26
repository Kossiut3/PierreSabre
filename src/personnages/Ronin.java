package personnages;

public class Ronin extends Humain {

	private int attributHonneur = 1;
	
	public Ronin (String nom, String boissonFavorite, int nbArgent) {
		super(nom, boissonFavorite, nbArgent);
	}
	
	public void donner(Commercant beneficiaire) {
		int adonner = (this.nbArgent * 10) / 100 ;
		parler(beneficiaire.getNom() + " prend ces " + adonner + " sous.");
		beneficiaire.recevoir(adonner); 
	}
}
