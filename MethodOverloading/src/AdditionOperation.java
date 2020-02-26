
public class AdditionOperation {
	
	int add() {
		System.out.println("None");
		return 0;
	}
	int add(int a) {
		System.out.println("Int");
		return a;
	}
	int add(int a, int b) {
		System.out.println("Two Argument int");
		return a+b;
	}
	
	float add(float a) {
		System.out.println("Float");
		return a;
	}
	
	float add(float a, int b) {
		return a+b;
	}

}
