import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Personnel {
	
	
	Scanner reader = new Scanner(System.in);

	private String empType;
	private String uptype;
	private String deleteEmploye;
	private int idEmploye;
	private int empDeletId;
	
	Connection conn = null;
	
	private double vendeurChifreAffaire = 1500;
	private double representeurChifreAffaire = 2000;
	private double unitesProduitesMensuellemen = 5;
	private double nombreHeureTravailler = 20;
	
	public double calculerSalaire() {
		if(this.empType == "vendeur")
			return this.vendeurChifreAffaire*0.2 + 1500; //3500
		if(this.empType == "representeur")
			return this.representeurChifreAffaire*0.2 + 2500; //6500
		if(this.empType == "productor")
			return this.unitesProduitesMensuellemen*5 + ProdArisque.salaireFixeDeProducteur; //250
		if(this.empType == "Manutentionaire" )
			return this.nombreHeureTravailler*50 + ManuArisque.salaireFixeDeManutionaire; //5200
		return 0;
	}
	
	public void addEmployee(String empType) throws SQLException{
		conn = DBconn.conn();
		
		this.empType = empType;
		
		
		 System.out.println("Entrez le nom");
		 String nomV = reader.next();
		 
		 System.out.println("Entrez le prenom");
		 String prenomV = reader.next();
		 
		 System.out.println("Entrez le age");
		 int ageV = reader.nextInt();
		 
		 System.out.println("Entrez la date d'entrée de l'entreprise");
		 int dateV = reader.nextInt();
		 
		 /*
		 System.out.println("Entrez le Chiffre d'affaires ce mois");
		 double ChiffreAffairesV = reader.nextDouble();
		 */
		 
		 try {
			 String query = "INSERT INTO "+ this.empType +" (`nom`, `prenom`, `age`, `dateEntr`, `salaire`) VALUES (?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, nomV);
				ps.setString(2, prenomV);
				ps.setInt(3, ageV);
				ps.setInt(4, dateV);
				ps.setDouble(5, calculerSalaire());
				
				ps.executeUpdate();
				System.out.println("data inserted"); 
		 }
		 catch(SQLException e) {
			 System.out.println(e);
		 }
		 
	}
	
	public void UpdateEmploye(int idEmploye, String empType) throws SQLException {
		this.idEmploye = idEmploye;
		this.empType = empType;
		
		String UEmpFirstName;
		String UEmpLastName;
		int UEmpAge;
		int UDateDES;
		
		conn = DBconn.conn();

		try {
			String sql = "UPDATE "+this.empType+" SET `nom`=?, `prenom`=?, `age`=?, `dateEntr`=?, `salaire`=? WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			System.out.println("entrer le nom de employee");
			UEmpFirstName = reader.next();
			
			System.out.println("entrer le prenom de employee");
			UEmpLastName = reader.next();
			
			System.out.println("entrer age de employee");
			UEmpAge = reader.nextInt();
			
			System.out.println("entrer d'entrée dans l'entreprise");
			UDateDES = reader.nextInt();
			
			System.out.println("entrer salaire de employee");
			double salaire = reader.nextDouble();

			ps.setString(1, UEmpFirstName);
			ps.setString(2, UEmpLastName);
			ps.setInt(3, UEmpAge);
			ps.setInt(4, UDateDES);
			ps.setDouble(5, salaire);
			ps.setInt(6, this.idEmploye);
			
			ps.executeUpdate();

			System.out.println("the data updated sucssesfuly !!!!!!");
			
		} catch (SQLException e) {
			System.err.println(e);
		}
	}
	
	public void DeleteEmployee(int empDeletId, String empType) throws SQLException {
		this.empDeletId = empDeletId;
		this.empType = empType;
		
		conn = DBconn.conn();

		try {
			String sql = "DELETE FROM "+this.empType+" WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, this.empDeletId);
			ps.executeUpdate();
			
			System.out.println("the data deleted sucssesfuly !!!!!!");
			
		} catch (SQLException e) {
			System.err.println(e);
		}
	}
}
