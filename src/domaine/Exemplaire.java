package domaine;

public class Exemplaire {
	private boolean empruntable = true;
	private boolean enLigne = true;
	private boolean emprunte = false;
	private String cote;

	public Exemplaire(String cote) {
		this.cote = cote;
	}

	public boolean isEmpruntable() {
		return empruntable;
	}

	public boolean isEnLigne() {
		return enLigne;
	}

	public boolean isEmprunte() {
		return emprunte;
	}

	public String getCote() {
		return cote;
	}

	@Override
	public String toString() {
		return "Exemplaire [empruntable=" + empruntable + ", enLigne=" + enLigne + ", emprunte=" + emprunte + ", cote="
				+ cote + "]";
	}
}
