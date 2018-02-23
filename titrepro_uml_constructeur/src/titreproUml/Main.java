package titreproUml;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profs p = new Profs();
		Eleves e = new Eleves();
		
		p.setNom("Martin");
		String prof = p.getNom();
		
		e.setNom("Jules");
		String eleve = e.getNom();

		
	System.out.println("Le professeur " + prof + " a comme eleve" + eleve);

	
	}

}
