import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Connexion implements Runnable {

	
	private Socket s;
	private PrintWriter output;
	BufferedReader in;
	private PrintWriter out;

	public Connexion (Socket s) { 
		
		this.s = s;
	
	try {
	
		
		BufferedReader in = new BufferedReader ( new InputStreamReader(s.getInputStream()));
	
		PrintWriter out = new PrintWriter(s.getOutputStream());
	
	} catch (IOException e) {}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
			String ligne = in.readLine();
			
			if (ligne == null) break; //fin de connexion côté client
			
			output.println(ligne);
			out.flush();
			
			}
			
		} catch (IOException e) {}
		
			finally {try{s.close();}catch (IOException e){}}
		
	}
}
