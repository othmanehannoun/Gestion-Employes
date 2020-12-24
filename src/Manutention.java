
public class Manutention extends Employe{

	private int nbrHeure;
	public Manutention(String nom, String prenom, int age, String date, int heure) {
		super(nom, prenom, age, date);
		this.setNbrHeure(heure);
	}

	public Manutention() {
	}

	public int getNbrHeure() {
		return nbrHeure;
	}

	public void setNbrHeure(int nbrHeure) {
		this.nbrHeure = nbrHeure;
	}

	
	public double CalculerSalaire() {
		return getNbrHeure() * 50;	
	}
	
}
