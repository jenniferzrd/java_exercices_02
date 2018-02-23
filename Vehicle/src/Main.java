
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeep j = new Jeep();
		Hovercraft h = new Hovercraft();
		
		System.out.println("la voiture " + j.getName() + " possede " + j.getMaxPassengers() + " passagers " + " et il y a " + j.getNumWheels() + " roues ");
		System.out.println("la voiture " + h.getName() + " possede " + h.getMaxPassengers() + " passagers " + " et il y a " + h.getNumWheels() + " roues " + " et peu parcourir " + h.displacement + " m ");
	}

}
