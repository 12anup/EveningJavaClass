package oopexample;

public class Technician extends Person{
	
	public void message() {
		System.out.println("this is from Technician class ");
	}
	
	public void display() {
		message();
		super.message();
	}
	
	public static void main(String[] args) {
		Technician technician=new Technician();
		technician.display();
		// TODO Auto-generated method stub

	}

}
