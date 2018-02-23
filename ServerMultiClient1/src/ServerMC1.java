import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int PORT = 9999;
			
			ServerSocket serveur = new ServerSocket(PORT);
			System.out.println("Server socket ready on port:" + PORT );
			Socket sock = serveur.accept();
			
			BufferedReader ed = new BufferedReader( new InputStreamReader(sock.getInputStream()));
			String tmp;
			
			while (true) {
				Socket socket = serveur.accept();
				// ici le serveur attend de recevoir la connexion du client
			}
		}
			
		catch (Exception e) {
			System.out.println("Serveur stopped receiving");
		}
		

	}

}
