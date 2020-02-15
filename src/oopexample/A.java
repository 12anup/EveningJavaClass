package oopexample;

class B{
	int roll;
	
	void displayB() {
		System.out.println("this is from class B");
	}
}

public class A extends B {
	String name;
	
	void display() {
		System.out.println("this is from class A");
	}
	void displayResult() {
		System.out.println("the name is"+name+" and roll is :"+roll);
	}
	public static void main(String[] args) {
		A a=new A();
		a.display();
		a.displayB();
		a.roll=5;
		a.name="ram";
		a.displayResult();
	

	}

}
