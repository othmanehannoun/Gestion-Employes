import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	
	static String url = "jdbc:mysql://localhost/GestionPersonnel";
	static String passwrd = "";
	static String user = "root";
	
	static Connection conn;

	public static void main(String[] args) throws SQLException {
		Statement stmt;
		
		Vendeur vendeur = new Vendeur();
		Présenteur presenteur = new Présenteur();
		Producteur producteur = new Producteur();
		Manutention matitantion = new Manutention();
		
try {
			
			conn = DriverManager.getConnection(url, user, passwrd);
			System.out.println("ok");
			}catch(SQLException ee){
				System.out.println(ee.getMessage());
			}



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
			 System.out.println("1: Vendeur");
		     System.out.println("2: Representeur");
	    	 System.out.println("3: Producteur");
			 System.out.println("4: Manutention");
			 int TypeChoix = reader.nextInt();
			 
			 switch(TypeChoix) {
			 case 1:
				 System.out.println("Entrez le nom");
				 String nomV = reader.next();
				 vendeur.setNom(nomV);
				 
				 System.out.println("Entrez le prenom");
				 String prenomV = reader.next();
				 vendeur.setPrenom(prenomV);
				 
				 System.out.println("Entrez le age");
				 int ageV = reader.nextInt();
				 vendeur.setAge(ageV);
				 
				 System.out.println("Entrez la date d'entrée de l'entreprise");
				 String dateV = reader.next();
				 vendeur.setDateEntrer(dateV);
				 
				 System.out.println("Entrez le Chiffre d'affaires ce mois");
				 double ChiffreAffairesV = reader.nextDouble();
				 vendeur.setCheffreAffire(ChiffreAffairesV);
				 
				 String query = "INSERT INTO `vendeur`(`nom`, `prenom`, `age`, `dateEntr`, `salaire`) VALUES (?,?,?,?,?)";
					PreparedStatement ps = conn.prepareStatement(query);
					ps.setString(1, vendeur.getNom());
					ps.setString(2, vendeur.getPrenom());
					ps.setInt(3, vendeur.getAge());
					ps.setString(4, vendeur.getDateEntrer());
					ps.setDouble(5, vendeur.CalculerSalaire());
					
					ps.executeUpdate();
				 break;
			 case 2:
				 System.out.println("Entrez le nom");
				 String nomP = reader.next();
				 presenteur.setNom(nomP);
				  
				 System.out.println("Entrez le prenom");
				 String prenomP= reader.next();
				 presenteur.setPrenom(prenomP);
				 
				 System.out.println("Entrez le age");
				 int ageP = reader.nextInt();
				 presenteur.setAge(ageP);
				 
				 System.out.println("Entrez la date d'entrée de l'entreprise");
				 String dateP = reader.next();
				 presenteur.setDateEntrer(dateP);
				 
				 System.out.println("Entrez le Chiffre d'affaires ce mois");
				 double ChiffreAffairesP = reader.nextDouble();
				 presenteur.setCheffreAffire(ChiffreAffairesP);
				 
				 String queryP = "INSERT INTO `presenteur`(`nom`, `prenom`, `age`, `dateEntr`, `salaire`) VALUES (?,?,?,?,?)";
					PreparedStatement Ep = conn.prepareStatement(queryP);
					Ep.setString(1, presenteur.getNom());
					Ep.setString(2, presenteur.getPrenom());
					Ep.setInt(3, presenteur.getAge());
					Ep.setString(4, presenteur.getDateEntrer());
					Ep.setDouble(5, presenteur.CalculerSalaire());
					
					Ep.executeUpdate();
				 break;
			 case 3:
				 System.out.println("Entrez le nom");
				 String nomPdr = reader.next();
				 producteur.setNom(nomPdr);
				  
				 System.out.println("Entrez le prenom");
				 String prenomPdr = reader.next();
				 producteur.setPrenom(prenomPdr);
				 
				 System.out.println("Entrez le age");
				 int agePdr = reader.nextInt();
				 producteur.setAge(agePdr);
				 
				 System.out.println("Entrez la date d'entrée de l'entreprise");
				 String datePdr = reader.next();
				 producteur.setDateEntrer(datePdr);
				 
				 System.out.println(" le nombre d'unités produites");
				 int unite = reader.nextInt();
				 producteur.setUnite(unite);
				 
				 String queryPdr = "INSERT INTO `producteur`(`nom`, `prenom`, `age`, `dateEntr`, `salaire`) VALUES (?,?,?,?,?)";
					PreparedStatement Epd = conn.prepareStatement(queryPdr);
					Epd.setString(1, producteur.getNom());
					Epd.setString(2, producteur.getPrenom());
					Epd.setInt(3, producteur.getAge());
					Epd.setString(4, producteur.getDateEntrer());
					Epd.setDouble(5, producteur.CalculerSalaire());
					
					Epd.executeUpdate();
				 break;
			 case 4:
				 System.out.println("Entrez le nom");
				 String nomM = reader.next();
				 matitantion.setNom(nomM);
				  
				 System.out.println("Entrez le prenom");
				 String prenomM = reader.next();
				 matitantion.setPrenom(prenomM);
				 
				 System.out.println("Entrez le age");
				 int ageM = reader.nextInt();
				 matitantion.setAge(ageM);
				 
				 System.out.println("Entrez la date d'entrée de l'entreprise");
				 String dateM = reader.next();
				 matitantion.setDateEntrer(dateM);
				 
				 System.out.println(" le nombre d'unités produites");
				 int nbrHeure = reader.nextInt();
				 matitantion.setNbrHeure(nbrHeure);;
				 
				 String queryM = "INSERT INTO `producteur`(`nom`, `prenom`, `age`, `dateEntr`, `salaire`) VALUES (?,?,?,?,?)";
					PreparedStatement Em = conn.prepareStatement(queryM);
					Em.setString(1, matitantion.getNom());
					Em.setString(2, matitantion.getPrenom());
					Em.setInt(3, matitantion.getAge());
					Em.setString(4, matitantion.getDateEntrer());
					Em.setDouble(5, matitantion.CalculerSalaire());
					Em.executeUpdate();
				 break;
			 }
			 break;
		 
		 case 2:
			 
			 break;
		 case 3:
			 break;
		 case 4:
			 System.out.println(" ===Des Employes Vendeurs===");
			 stmt = conn.createStatement();
				String queryAffiche = "SELECT * FROM vendeur";
				ResultSet res = stmt.executeQuery(queryAffiche);
				while(res.next()) {
					System.out.println("ID:" + res.getInt("idV") + " Nom:" + res.getString("nom") + " prenom:" + res.getString("prenom")
					                   + " Age:" + res.getInt("age") + " date:" + res.getString("dateEntr") 
					                   + " salaire:" + res.getString("salaire"));
				}
				
				System.out.println("");
				System.out.println(" ===Des Employes Presenteurs===");
				String queryAfficheP = "SELECT * FROM presenteur";
				ResultSet resP = stmt.executeQuery(queryAfficheP);
				
				while(resP.next()) {
					System.out.println("ID:" + resP.getInt("id") + " Nom:" + resP.getString("nom")
					                   + " prenom:" + resP.getString("prenom")
					                   + " Age:" + resP.getInt("age") + " date:" + resP.getString("dateEntr") 
					                   + " salaire:" + resP.getString("salaire"));
				}
				
				System.out.println("");
				System.out.println(" ===Des Employes Producteur===");
				String queryAffichePd = "SELECT * FROM Producteur";
				ResultSet resPd = stmt.executeQuery(queryAffichePd);
				
				while(resPd.next()) {
					System.out.println("ID:" + resPd.getInt("id") + " Nom:" + resPd.getString("nom")
					                   + " prenom:" + resPd.getString("prenom")
					                   + " Age:" + resPd.getInt("age") + " date:" + resPd.getString("dateEntr") 
					                   + " salaire:" + resPd.getString("salaire"));
				}
				
				System.out.println("");
				System.out.println(" ===Des Employes Manutantion===");
				String queryAfficheM= "SELECT * FROM manutantion";
				ResultSet resM = stmt.executeQuery(queryAfficheM);
				
				while(resM.next()) {
					System.out.println("ID:" + resM.getInt("id") + " Nom:" + resM.getString("nom")
					                   + " prenom:" + resM.getString("prenom")
					                   + " Age:" + resM.getInt("age") + " date:" + resM.getString("dateEntr") 
					                   + " salaire:" + resM.getString("salaire"));
				}
			 break;
			 
		 }
     }
     

	}

}
