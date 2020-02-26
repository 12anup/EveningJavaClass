package com.javaclass;

public class ClassAndMethod {

	public static void main(String[] args) {
		Employee newEmployee = new Employee();
		Employee employee = new Employee();
		System.out.println(newEmployee.fullName);
		newEmployee.fullName = "New Employee";
		System.out.println(newEmployee.fullName);
		System.out.println(employee.fullName);
		
//		String objFullName = "New Employee";
		String objFullName = newEmployee.getFullName();
		
		System.out.println("Obj Full Name1 "+objFullName);
		System.out.println("Obj Full Name2 "+newEmployee.getFullName());
		
		employee.fullName = "Prabeen";
		System.out.println(employee.fullName);
		
		
		Addition addition = new Addition();
		int sum = addition.add(12, 10);
		System.out.println(sum);
		System.out.println(addition.subtract(23, 2));

	}

}
