	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

public class TrainLogin {

		public static void main(String[] args) throws SQLException {
			
			try  {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/reservation";
			String user = "postgres";
			String passwd = "simplonco";
			
			Connection conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("connexion effectuée, driver ok");
			
			Statement s = conn.createStatement();
			String query = "SELECT * FROM" + " \"LoginTrain\" ";
			ResultSet result = s.executeQuery(query);
			
//			String nom;
//			String prenom;
//			String vol;
//			String client;
//			
//			while(result.next()) {
//				nom = result.getString("Nom");
//				prenom = result.getString("Prenom");
//				vol = result.getString("noVol");
//				client = result.getString("noClient");
//				
//				System.out.println("idPassager : " + client + " -> " +nom + " " + prenom + " has taken : " + vol);
//			
//			}
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		public static boolean authenticate(String username, String password) {
			// TODO Auto-generated method stub
			return false;
		}

	}
