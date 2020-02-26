package runtimepolymorphism;

public class Splendor extends Bike {
	int a=5;
	@Override
	public void run() {
		System.out.println("Splendor is running");
	}
	
	public void displayInfo() {
		System.out.println("this is Splendor class");
	}

	public static void main(String[] args) {
		Bike b=new Splendor();   //dynamic binding
//		b.run();
//		Splendor s=new Splendor();  //static binding
//		s.displayInfo();
//		b.display();
		System.out.println(b.a);
		
	}

}
