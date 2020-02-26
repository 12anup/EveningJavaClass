package oopexample;

class B{
	int roll;
	
	void display() {
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
	
	int sum(int a,int b) {
		return a+b;
	}
	
	double sum(double a,int b) {
		return a+b;
//		System.out.println("thi is resuylt"+(a+b));
	}
	
	void sum(int a,int b,int c) {
		System.out.println("the sum is:"+(a+b+c));
//		return a+b+c;
	}
	
	void display(String name,String roll) {
		System.out.println("the name is"+name+"the roll is+"+roll);
	}
	
	void display(String n,int r) {
		System.out.println("the name is"+n+"the roll is+"+r);
	}
	
	public static void main(String[] args) {
		A a=new A();
		int result=a.sum(2,5);
		int percentage=result/20;
		if(percentage>=60) {
			System.out.println("first div");
		}

		
		
		
//		System.out.println(result);
		
//		int res=a.sum(1, 2,3);
//		System.out.println(res);
//		a.display();
//		a.displayB();
//		a.roll=5;
//		a.name="ram";

//		a.displayResult();
	

	}

}
