import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String HOST = "";
		final int PORT = 9999 ;
		
		try {
			Socket socket = new Socket (HOST,PORT); 
			socket.close();

			
	} catch (IOException e) {}
		
	}

}
