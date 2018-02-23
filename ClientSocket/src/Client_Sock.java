import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client_Sock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String HOST = "";
		final int PORT = 9999 ;

		try {
			
			Socket socket = new Socket (HOST,PORT); 
			
		String temp;
		PrintStream pr = new PrintStream (socket.getOutputStream());
		System.out.println("Enter Something");
		
		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader ed = new BufferedReader(rd);
		
		temp = ed.readLine();
		
		pr.println(temp);
		while (temp != null) {
			System.out.println("Enter Something");
			rd = new InputStreamReader (System.in);
			ed = new BufferedReader(rd);
			temp = ed.readLine();
			pr.println(temp);
		}
		
		socket.close();
		
	} catch (Exception ex) {
		System.out.println("Something went wrong");

	}
	}

}
