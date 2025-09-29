package domaine;

public class Bilbliotheque {
	private static final int NB_MAX_OUVRAGES=50;
	
	private Ouvrage[] fonds;
	private int nbOuvrages = 0;

	public Bilbliotheque(int nbMaxOuvrages) {
		fonds = new Ouvrage[nbMaxOuvrages];
	}

	public Ouvrage[] getFonds() {
		return fonds;
	}

	public int getNbOuvrages() {
		return nbOuvrages;
	}
	
	public void AjouterOuvrage(Ouvrage ouvrage) {
		if (nbOuvrages<NB_MAX_OUVRAGES) {
			fonds[nbOuvrages++] = ouvrage;
		}
	}
	
	@Override
	public String toString() {
		String textualState = "Bibliotheque d'un fond de "+nbOuvrages+" ouvrages :\n";
		for (int i=0;i<nbOuvrages;i++) {
			textualState+="- "+fonds[i]+"\n";
		}
		return textualState;
	}
}