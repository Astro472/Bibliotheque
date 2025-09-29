package scenario;

import domaine.Bilbliotheque;
import domaine.Exemplaire;
import domaine.Ouvrage;

public class TestBibliotheque {
	public static void main(String[] args) {
		Bilbliotheque maBibliotheque = new Bilbliotheque(50);
		Ouvrage bse = new Ouvrage("Base Software Engineering", null, null, 0, null);
		Exemplaire bse1 = new Exemplaire(null);
		maBibliotheque.AjouterOuvrage(bse);
		System.out.println(maBibliotheque);
	}
}
