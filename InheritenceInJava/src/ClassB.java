//Single
public class ClassB extends ClassA {
	
	int a = 30;
	int b = 20;
	
	void sum() {
		System.out.println("Sum :"+(super.a+b));
	}
	
	void msg() {
		super.msg();
		System.out.println("Value of b: "+b);
	}

}
