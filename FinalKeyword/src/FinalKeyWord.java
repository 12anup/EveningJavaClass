
public class FinalKeyWord {

	public static void main(String[] args) {
		Bike bike = new Bike(120);
		//final variable 
		System.out.println(bike.speedLimit);
//		bike.speedLimit =120;
//		System.out.println(bike.speedLimit);
		
		// final method 
		bike.getSpeedLimit();
		
		// final class 
		Bus bus = new Bus();
		bus.getSpeedLimit();

	}

}
