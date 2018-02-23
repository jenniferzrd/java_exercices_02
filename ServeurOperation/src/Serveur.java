import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int PORT = 9998;
			
			ServerSocket serveur = new ServerSocket(PORT);
			System.out.println("Server socket ready on port:" + PORT );
			Socket sock = serveur.accept();
			
			BufferedReader ed = new BufferedReader( new InputStreamReader(sock.getInputStream()));
			int tmp = Integer.valueOf(ed.readLine());
			int tmp1 = Integer.valueOf(ed.readLine());
			
		    System.out.println( tmp + tmp1);
		    
		    PrintStream pr = new PrintStream (sock.getOutputStream());
		    pr.println(tmp + tmp1);
		}
		
		catch (Exception e) {
			System.out.println("Serveur stopped receiving");
		}
		
	}

}
