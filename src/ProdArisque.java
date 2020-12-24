
public class ProdArisque extends Producteur{

	public ProdArisque(String nom, String prenom, int age, String date, int unite) {
		super(nom, prenom, age, date, unite);
			
	}
	
	public double CalculerSalaire() {
		return super.CalculerSalaire() + 200;
	}

	
}
