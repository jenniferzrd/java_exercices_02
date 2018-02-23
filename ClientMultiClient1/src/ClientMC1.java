import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ClientMC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String HOST = "";
		final int PORT = 9999 ;
		
		try{
			ServerSocket serveur = new ServerSocket(PORT); while
			(true) {
				
			//accepter une connexion
			
				Socket socket = serveur.accept();
			
				// créer un thread : pour échanger les données avec le client
			
				Connexion c = new Connexion(socket);
			Thread processus_connexion = new Thread(c);
			processus_connexion.start();
			
			}
			
		} catch (IOException e) {}
		
	}

}
