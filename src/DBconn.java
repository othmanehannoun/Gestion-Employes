import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {
	static String url = "jdbc:mysql://localhost/GestionPersonnel";
	static String passwrd = "";
	static String user = "root";

	public static Connection conn() throws SQLException {
		return DriverManager.getConnection(url, user, passwrd);
	}	
}
