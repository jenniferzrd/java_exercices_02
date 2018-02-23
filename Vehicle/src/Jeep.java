
public class Jeep implements IsLandVehicle {

		String name = "Jeep";
		int number = 4;
		int vitesse = 150;
		int wheels = 4;
		
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public int getMaxPassengers() {
		// TODO Auto-generated method stub
		return number;
		
	}

	@Override
	public void setMaxPassengers(int number) {
		// TODO Auto-generated method stub
		this.number = number;
	}

	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return vitesse;
	}

	@Override
	public void setMaxSpeed(int vitesse) {
		// TODO Auto-generated method stub
		this.vitesse = vitesse;
	}

	@Override
	public int getNumWheels() {
		// TODO Auto-generated method stub
		return wheels;
	}

	@Override
	public void setNumWheels(int wheels) {
		// TODO Auto-generated method stub
		this.wheels = wheels;
	}
	
	public void soundHorm() {
		System.out.println("jeep");
	}

}
