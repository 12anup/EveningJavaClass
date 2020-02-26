package com.javaclass;

public class StaticKeyword {
	static {
    	Student.college = "LEC";
    	System.out.println("Static Block Called");
    }

	public static void main(String[] args) {

		Student.college = "KEC";
		
//		Student.display(); not static canot called this way
	
		
		Student std = new Student(1,"Bimal");
		Student std1 = new Student(2,"Sagar");
		
		std.display();
		
		Student.change();
		
		Student.college = "ABC";
		Student std2 = new Student(3,"Chandra");
		std.display();
		std1.display();
		std2.display();
	}

}
