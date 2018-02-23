import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class zoo_connection {
	
	public static void main(String[] args) throws SQLException {
		
		try  {
		Class.forName("org.postgresql.Driver");
		
		String url = "jdbc:postgresql://localhost:5432/zoo";
		String user = "postgres";
		String passwd = "simplonco";
		
	
		Connection conn = DriverManager.getConnection(url, user, passwd);
		System.out.println("connexion effectuée, driver ok");
	
		
		//PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS Animal (id INTEGER PRIMARY KEY, nom TEXT, nomS TEXT, nomV TEXT)");
		//create.executeUpdate();
		
		Statement s = conn.createStatement();
		String query = "SELECT * FROM" + " \"Animal\" ";
		ResultSet result = s.executeQuery(query);
		
		String nom;
		String nomS;
		String nomV;
		String famille;
		String sexe;
		Date dateN;
		Date dateA;
		String remarque;
		
		while(result.next()) {
			nom = result.getString("nom");
			nomS = result.getString("nomS");
			nomV = result.getString("nomV");
			famille = result.getString("famille");
			sexe = result.getString("sexe");
			remarque = result.getString("remarque");
			dateN = result.getDate("dateN");
			dateA = result.getDate("dateA");
			
			System.out.println("Mon animal est : " + famille + " -> " +nom + " " + nomS + " has taken : " + remarque);
		
		}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}