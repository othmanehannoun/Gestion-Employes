
public class Présenteur extends Employe{

	private double cheffreAffire;
	public Présenteur(String nom, String prenom, int age, String date, double cheffreAffire) {
		super(nom, prenom, age, date);
		this.cheffreAffire = cheffreAffire;
		
	}
	

	public Présenteur() {
		
	}


	public double getCheffreAffire() {
		return cheffreAffire;
	}
	public void setCheffreAffire(double cheffreAffire) {
		this.cheffreAffire = cheffreAffire;
	}

	public double CalculerSalaire() {
		return (getCheffreAffire() * 0.20) + 2500;
	}
	
}
