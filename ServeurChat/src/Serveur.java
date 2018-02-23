import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
// accepte les connexions venues des clients.
import java.net.Socket;
// cette classe permet de se connecter à la machine distante.
import java.util.Scanner;

public class Serveur {
	
	public static void main(String[] test) {
	
		final ServerSocket serveurSocket  ;
        final Socket clientSocket ;
		final BufferedReader in;
		//  lie le texte reçu à partir de l'émetteur.
		final PrintWriter out;
		// envoie le texte saisi.
	    final Scanner sc=new Scanner(System.in);
	    // li les entrées clavier
	    
	    
	    try {	        
	        serveurSocket = new ServerSocket(5000);
	        // nouveau server, 5000 est son adresse
	        clientSocket = serveurSocket.accept();
	     // ouvre le port quand il reçoit il accepte et ouvre
	        out = new PrintWriter(clientSocket.getOutputStream());
	        // recup le text saisi flux out = reception
	        in = new BufferedReader (new InputStreamReader (clientSocket.getInputStream()));
	     // flux envoi
	        
	        Thread envoi= new Thread(new Runnable() {
	            String msg;
	            @Override
	            public void run() {
	               while(true){
	                  msg = sc.nextLine();
	                  // stocke le texte de toute la ligne
	                  out.println(msg);
	                  out.flush();
	               }
	            }
	         });
	         envoi.start();
	     
	         Thread recevoir= new Thread(new Runnable() {
	            String msg ;
	            @Override
	            public void run() {
	               try {
	                  msg = in.readLine();
	                  //tant que le client est connecté
	                  while(msg!=null){
	                     System.out.println("Client : "+msg);
	                     msg = in.readLine();
	                     //lire une ligne de caractères dans le flux
	                  }
	                  //sortir de la boucle si le client a déconecté
	                  System.out.println("Client déconecté");
	                  //fermer le flux et la session socket
	                  out.close();
	                  clientSocket.close();
	                  serveurSocket.close();
	               } catch (IOException e) {
	                    e.printStackTrace();
	               }
	           }
	        });
	        recevoir.start();
	        }catch (IOException e) {
	           e.printStackTrace();
	        }
	     }
	  }


    /*String s;
    s = sc.next();
    // la méthode next stock le texte saisi
    out.println(s);
    // on l'affiche
    out.flush();    
    // vide le buffer afin que cela ne sort pas "null"
    String message_client ;
    message_client = in.readLine();
    // la variable stock le message et envoie/affiche au println
    System.out.println("Client : "+message_client);
    }*/

// Il faut deux tread l'un pour l'envoie l'autre pour la réception afin que cela soit simultané