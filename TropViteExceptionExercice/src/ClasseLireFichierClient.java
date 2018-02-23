import java.io.*;


public class ClasseLireFichierClient {
    
     public static  void lire(String myFile) throws IOException {
         try {
                File f = new File("src/"+myFile+".txt");
                FileReader fr = new FileReader(f);
                
                BufferedReader br = new BufferedReader(fr);
                
                String ligne = null;
                
                while ((ligne = br.readLine()) !=null){
                    System.out.println(ligne);
                }
                br.close();
            }catch (IOException ex) {ex.printStackTrace();}
     }

    public static void main(String[] args) {
        try {
            lire("myFile");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}