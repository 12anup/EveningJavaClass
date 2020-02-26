
public class MethodOverriding {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.run();
		Bus bus = new Bus();
		bus.run();
		
		//static in inheritance
		System.out.println(Vehicle.speed);
		Bike.speed = 80;
		System.out.println(Vehicle.speed);
		
		//Runtime Polymorphism
		
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		vehicle = new Bike();
		vehicle.run();
		vehicle = new Bus();
		vehicle.run();

	}

}
