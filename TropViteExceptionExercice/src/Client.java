
public class Client {

	String nom;
	String prenom;
	String iban;
	
	public Client (String nom, String prenom, String iban) {
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	
	public String toString() {
		return "Nom : " +nom + "Prenom:" + prenom + "Iban:" + iban;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//monObjet.setName("toto");
//System.out.println(monObjet.toString());
