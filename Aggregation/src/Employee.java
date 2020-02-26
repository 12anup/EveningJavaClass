
public class Employee {
	String name;
	Address address;
	
	public Employee(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(address.country);
		System.out.println(address.state);
		System.out.println(address.city);
	}

}
