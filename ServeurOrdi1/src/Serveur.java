import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.PrintStream;

import java.net.ServerSocket;

import java.net.Socket;

public class Serveur {

 public static void main(String[] args) {
  final int PORT = 9999;

 try {
      ServerSocket server = new ServerSocket(PORT);
      System.out.println("Server socket ready on port :" + PORT);
      Socket socket = server.accept();

     BufferedReader ed = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      String tmp;
      while((tmp = ed.readLine()) != null){
          System.out.println("I received: "+ tmp);
          
          PrintStream pr = new PrintStream (socket.getOutputStream());
		  pr.println(tmp);
      }
  } catch(Exception e){
      System.out.println("Server stopped receiving");
  }
}
}