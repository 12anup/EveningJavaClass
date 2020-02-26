
public class Bike extends Vehical {
	final int speedLimit;
	// we canot override final method
//	@Override
//	void getSpeedLimit() {
//		System.out.println("Speed Lomit is "+speedLimit);
//	}
	
	Bike(int speedLimit){
		this.speedLimit = speedLimit;
		
	}
	

}
