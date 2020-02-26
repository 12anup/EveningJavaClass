
public class MethodOverloading {

	public static void main(String[] args) {
		AdditionOperation addition = new AdditionOperation();
		System.out.println(addition.add());
		System.out.println(addition.add(2));
		System.out.println(addition.add(2.2f));
		System.out.println(addition.add(3,4));
		
		MupliplicationOperation mul = new MupliplicationOperation();
		mul.multiplication(2l, 3);

	}

}
