
public class Pr�senteur extends Employe{

	private double cheffreAffire;
	public Pr�senteur(String nom, String prenom, int age, String date, double cheffreAffire) {
		super(nom, prenom, age, date);
		this.cheffreAffire = cheffreAffire;
		
	}
	

	public Pr�senteur() {
		
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
