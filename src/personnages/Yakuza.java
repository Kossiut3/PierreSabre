package personnages;

import java.awt.Point;

public class Yakuza extends Humain {
	private String nomClan;
	private int pointReputation = 0;
	
	public Yakuza (String nom, String boissonFavorite, int nbArgent, String nomClan) {
		super(nom, boissonFavorite, nbArgent);
		this.nomClan = nomClan;
	}

	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler( victime.getNom()+" si tu tiens à la vie donne moi ta bourse !");
		int vol = victime.seFaireExtorquer();
		this.nbArgent += vol;
		parler("J’ai piqué les "+ vol +" sous de "+ victime.getNom() +", ce qui me fait " +this.nbArgent
		+" sous dans ma poche. Hi ! Hi !");
		pointReputation += 1;
		
	}
}
