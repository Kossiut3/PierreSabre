package personnages;

public class Commercant extends Humain {

	private static final String boissonF = "the";

	public Commercant(String nom, String boissonFavorite, int nbArgent) {
		super(nom, boissonFavorite, nbArgent);
	}

	public int seFaireExtorquer() {
		int varloc = this.nbArgent;
		this.nbArgent = 0;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return varloc;
	}

	public void recevoir(int argent) {
		this.nbArgent += argent;
		parler(argent + " sous! Je te remercie généreux donateur!");
	}

	public static void main(String[] args) {
		
	}

}
