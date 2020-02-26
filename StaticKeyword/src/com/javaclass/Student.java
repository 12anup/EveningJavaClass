package com.javaclass;

public class Student {
	int rollNo;
	String name;
    static String college;
	
	Student(int r,String n){
		rollNo = r;
		name = n;
	}
	
	void display() {
		System.out.println("RollNo: "+ rollNo);
		System.out.println("Name: "+name);
		System.out.println("College: "+ college);
	}
	
	static void change() {
//		System.out.println("RollNo: "+ rollNo); static method canot access non static variable
		college = "NEC";
		System.out.println("College: "+ college);
		System.out.println("Static method called");
	}
	

}
