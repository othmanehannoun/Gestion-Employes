
public class Producteur extends Employe{
	private int unite;

	public Producteur(String nom, String prenom, int age, String date, int unite) {
		super(nom, prenom, age, date);
		this.unite = unite;
		
	}

	public Producteur() {
	
	}

	public double getUnite() {
		return unite;
	}

	public void setUnite(int unite2) {
		this.unite = unite2;
	}
	
	public double CalculerSalaire() {
		return getUnite() * 5;
	}
	
	

}