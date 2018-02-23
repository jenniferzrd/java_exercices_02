
public class Vehicule {

	
		public void testVitesse (int vit) throws TropViteException {
			if (vit > 90 ) {
				throw new TropViteException(vit);
			}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule car = new Vehicule();
		
		try {
			car.testVitesse(100);
			
			} catch (Exception e) {

		System.out.print(e);
	}

}
}
