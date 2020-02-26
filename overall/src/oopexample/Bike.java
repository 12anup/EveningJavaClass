package oopexample;

public class Bike extends Vehicle {
	
	@Override
	void display() {
		System.out.println("this is from bike class");
	}
	
	void run() {
		System.out.println("bike is running");
	}

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.display();
		bike.run();
		// TODO Auto-generated method stub

	}

}
