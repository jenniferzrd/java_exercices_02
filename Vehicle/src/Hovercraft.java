
public class Hovercraft implements IsLandVehicle, IsSeaVessel {

	String name = "Hovercraft";
	int number = 6;
	int vitesse = 200;
	int displacement = 12;
	int wheels = 6;
	
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
	public int getDisplacement() {
		// TODO Auto-generated method stub
		return displacement;
	}

	@Override
	public void setDisplacement(int displacement) {
		// TODO Auto-generated method stub
		this.displacement = displacement;
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
	
	public boolean enterLand() {
		return true;
}
	
	public boolean enterSea() {
		return true;
	}

}
