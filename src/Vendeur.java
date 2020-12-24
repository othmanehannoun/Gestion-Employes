
public class Vendeur extends Employe{

	private double cheffreAffire;
	public Vendeur(String nom, String prenom, int age, String date, double cheffreAffire) {
		super(nom, prenom, age, date);
		this.cheffreAffire = cheffreAffire;
	}
	
	
	public Vendeur() {

	}


	public double getCheffreAffire() {
		return cheffreAffire;
	}
	public void setCheffreAffire(double cheffreAffire) {
		this.cheffreAffire = cheffreAffire;
	}

	public double CalculerSalaire() {
		return (getCheffreAffire() * 0.20) + 1500;
	}
	

}
