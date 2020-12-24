import java.util.*;
public class Employe {

	private String nom;
	private String prenom;
	private int age;
	private String dateEntrer;
	
	public Employe(String nom, String prenom, int age, String date){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntrer = date;
		
	}
	public Employe() {
		
	}

	// ----CRETAE SETTER 
	

	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDateEntrer(String dateEntrer) {
		this.dateEntrer = dateEntrer;
	}

    // -----CREATE GETTER
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getAge() {
		return age;
	}
	public String getDateEntrer() {
		return dateEntrer;
	}
			
	
}
