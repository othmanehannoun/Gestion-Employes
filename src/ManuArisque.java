
public class ManuArisque extends Manutention{

	public ManuArisque(String nom, String prenom, int age, String date, int heure) {
		super(nom, prenom, age, date, heure);
		
	}
	
	public double CalculerSalaire() {
		return super.CalculerSalaire() + 200;
	}

}
