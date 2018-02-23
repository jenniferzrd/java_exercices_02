import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String HOST = "";
		final int PORT = 9998 ;

		try {
			
			Socket socket = new Socket (HOST,PORT); 
			
		String temp;
		String tem2;
		PrintStream pr = new PrintStream (socket.getOutputStream());
		System.out.println("Entrez un nombre");
		
		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader ed = new BufferedReader(rd);
		
		temp = ed.readLine();
		pr.println(temp);

		System.out.println("Entrez un nombre 2");
	
		temp = ed.readLine();
		
		pr.println(temp);
		
		BufferedReader ed2 = new BufferedReader( new InputStreamReader(socket.getInputStream()));
		
		String result = ed2.readLine();
		System.out.println(result);
		
//		for(int i = 0 ; i < 1; i++) {
//			System.out.println("Entrez un nombre");
//			rd = new InputStreamReader (System.in);
//			ed = new BufferedReader(rd);
//			temp = ed.readLine();
//			pr.println(temp);
//			
//			
//		}
		
		
//		while (temp != 10) {
//			System.out.println("Entrez un nombre");
//			rd = new InputStreamReader (System.in);
//			ed = new BufferedReader(rd);
//			 = ed.read();
//			pr.println(temp);
//		}
		
		socket.close();
		
	} catch (Exception ex) {
		System.out.println("Something went wrong");

	}
	}

}
