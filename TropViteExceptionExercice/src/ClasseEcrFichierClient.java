import java.io.*;


public class ClasseEcrFichierClient {
    public static void ecrireFichierClient(Client[] myClients, String myFile) throws IOException {
        try{
            FileWriter os = new FileWriter("src/"+myFile+".txt");
            
            for(int i = 0; i < myClients.length; i++){
                os.write(myClients[i].getNom()+" "+myClients[i].getPrenom()+" "+myClients[i].getIban()+ "\n");
            }
            
            
            os.close();
        }
        catch(IOException ex) {ex.printStackTrace();}
    }
    
    public static void main(String[] args) {
        Client[] myClients;
        String myFile = "myFile";
        myClients = new Client[3];
        myClients[0] = new Client("Bob", "Morane", "FR7630004015870002601171220");
        myClients[1] = new Client("Bruce", "Wayne", "FR7630004015870002601172520");
        myClients[2] = new Client("Corben", "Dallas", "FR7630004015870002601371220");
        
        try {
            ecrireFichierClient(myClients, myFile);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}