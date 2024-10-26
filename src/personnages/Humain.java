package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	protected int nbArgent;

	public Humain(String nom, String boissonFavorite, int nbArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.nbArgent = nbArgent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return nbArgent;
	}

	protected void parler(String texte) {
		System.out.println("L'HUMAIN " + nom + " : " + texte);
	}

	public void boire() {
		parler("Mmm,  un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (nbArgent > prix) {
			parler("J ai " + nbArgent + " sous en poche. Je vais pouvoir m offrir " + bien +" à " + prix + " sous.");
			perdreArgent(prix);
			if (bien != null && bien.equals("une boisson")) {
				boire();
				}
		} else {
			parler("J n'ai plus que " + nbArgent + " sous en poche. Je ne  peux  meme pas m'offrir " + bien + " à "
					+ prix + " sous.");
		}
	}

	private int gagnerArgent(int gain) {
		return nbArgent += gain;
	}

	private int perdreArgent(int perte) {
		if ((nbArgent - perte) > 0) {
			return nbArgent -= perte;
		}
		return 0;
	}

	public void direBonjour() {
		parler("Bonjour ! je m'appelle " + nom + " et j aime boire du " + boissonFavorite);
	}

	public static void main(String[] argv) {
		Humain paul = new Humain("Paul", "Cognac", 300);
		paul.direBonjour();
	}

}