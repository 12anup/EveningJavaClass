package override;

class Vehicle {
	int a=10;
	  Vehicle(){
		System.out.println("Vehicle is created");
	}
	  
	public void display() {
		System.out.println(a);
	}
}
public class Car extends Vehicle{
	int a=15;

	Car(){
//		super();
		System.out.println("Car is created");
	}
	public void display() {
		super.display();
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.a);
		c.display();
		

	}

}