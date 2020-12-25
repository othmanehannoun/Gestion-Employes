import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	


	public static void main(String[] args) throws SQLException {
		Statement stmt;
		
		Personnel personnel = new Personnel();
		
		Connection conn;
		Statement stat;
		ResultSet rs;
		conn = DBconn.conn();

     Scanner reader = new Scanner(System.in);
     
     boolean check = true;
     while(check) {
    	 System.out.println("=====beinvenue sur gestions des Employés======");
    	 System.out.println("1: Ajouter Emloye");
	     System.out.println("2: Modifier Emloye");
    	 System.out.println("3: Suprimer Emloye");
		 System.out.println("4: Affiche des Emloyes");
		 int choix = reader.nextInt();
		 
		 switch(choix) {
		 case 1:
			 System.out.println("Entrer type de Employe");
			 System.out.println("1: vendeur");
		     System.out.println("2: presenteur");
	    	 System.out.println("3: producteur");
			 System.out.println("4: manutantion");
			 int TypeChoix = reader.nextInt();
			 
			 switch(TypeChoix) {
			 	case 1:
			 		personnel.addEmployee("vendeur");
			 	break;
			 case 2:
				 personnel.addEmployee("presenteur");
				 break;
			 case 3:
				 personnel.addEmployee("producteur");
				 break;
			 case 4:
				 personnel.addEmployee("manutantion");
				 break;
			 }
			 break;
		 
		 case 2:
			 
			 System.out.println("entrer type de employee");
				System.out.println("1- vendeur");
				System.out.println("2- representeur");
				System.out.println("3- productor");
				System.out.println("4- mentionnaire");
				int typechoix = reader.nextInt();
				
				System.out.println("entrer le id de l'employee pour modifier");
				int idemploye = reader.nextInt();
				
				switch(typechoix) {
				case 1:
					personnel.UpdateEmploye(idemploye, "vendeur");
					break;
				case 2:
					personnel.UpdateEmploye(idemploye, "representeur");
					break;
				case 3:
					personnel.UpdateEmploye(idemploye, "productor");
					break;
				case 4:
					personnel.UpdateEmploye(idemploye, "mentionnaire");

					break;
				}
			 break;
		 case 3:
			 System.out.println("entrer type de employee");
				System.out.println("1- vendeur");
				System.out.println("2- representeur");
				System.out.println("3- productor");
				System.out.println("4- mentionnaire");
				int deletechoix = reader.nextInt();
				
			    System.out.println("entrer le id de l'employee pour suprimer");
				int empDeletId = reader.nextInt();
				
				switch(deletechoix) {
				case 1:
					personnel.DeleteEmployee(empDeletId, "vendeur");
					break;
				case 2:
					personnel.DeleteEmployee(empDeletId, "representeur");
					break;
				case 3:
					personnel.DeleteEmployee(empDeletId, "productor");
					break;
				case 4:
					personnel.DeleteEmployee(empDeletId, "mentionnaire");

					break;
				}
			 break;
		 case 4:
			 
			 System.out.println(" ===Des Employes Vendeurs===");
			 stmt = conn.createStatement();
				String queryAffiche = "SELECT * FROM vendeur";
				ResultSet res = stmt.executeQuery(queryAffiche);
				while(res.next()) {
					System.out.println("ID:" + res.getInt("id") + " Nom:" + res.getString("nom") + " prenom:" + res.getString("prenom")
					                   + " Age:" + res.getInt("age") + " date:" + res.getString("dateEntr") 
					                   + " salaire:" + res.getString("salaire")+ " DH");
				}
				
				System.out.println("");
				System.out.println(" ===Des Employes Presenteurs===");
				String queryAfficheP = "SELECT * FROM presenteur";
				ResultSet resP = stmt.executeQuery(queryAfficheP);
				
				while(resP.next()) {
					System.out.println("ID:" + resP.getInt("id") + " Nom:" + resP.getString("nom")
					                   + " prenom:" + resP.getString("prenom")
					                   + " Age:" + resP.getInt("age") + " date:" + resP.getString("dateEntr") 
					                   + " salaire:" + resP.getString("salaire") + " DH");
				}
				
				System.out.println("");
				System.out.println(" ===Des Employes Producteur===");
				String queryAffichePd = "SELECT * FROM Producteur";
				ResultSet resPd = stmt.executeQuery(queryAffichePd);
				
				while(resPd.next()) {
					System.out.println("ID:" + resPd.getInt("id") + " Nom:" + resPd.getString("nom")
					                   + " prenom:" + resPd.getString("prenom")
					                   + " Age:" + resPd.getInt("age") + " date:" + resPd.getString("dateEntr") 
					                   + " salaire:" + resPd.getString("salaire")+ " DH");
				}
				
				System.out.println("");
				System.out.println(" ===Des Employes Manutantion===");
				String queryAfficheM= "SELECT * FROM manutantion";
				ResultSet resM = stmt.executeQuery(queryAfficheM);
				
				while(resM.next()) {
					System.out.println("ID:" + resM.getInt("id") + " Nom:" + resM.getString("nom")
					                   + " prenom:" + resM.getString("prenom")
					                   + " Age:" + resM.getInt("age") + " date:" + resM.getString("dateEntr") 
					                   + " salaire:" + resM.getString("salaire")+ " DH");
				}
				
			 break;
			 
		 }
     }
     

	}

}
