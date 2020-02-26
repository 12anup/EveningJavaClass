package oopexample;
class Employee1{
	float salary=40000;
}
public class Programmer extends Employee1 {
	int bonus=10000;
	public static void main(String[] args) {
		Programmer p=new Programmer();
		System.out.println("Programmer salary is"+p.salary);
		System.out.println("Programmer bonus is"+p.bonus);	

	}

}
