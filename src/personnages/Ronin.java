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
	
	public void provoquer(Yakuza adversaire) {
		int force = this.attributHonneur * 2;
		if (force >= adversaire.getPointReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre"+
			" marchand!");
			parler("Je t’ai eu petit yakusa!");
			this.nbArgent += adversaire.perdre();
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.nbArgent);
			this.nbArgent = 0;
		}
	}
}
