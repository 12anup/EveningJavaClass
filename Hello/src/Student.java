
public class Student {


	@Override
	public String toString() {
		return "Hello";
	}

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());

	}

}
