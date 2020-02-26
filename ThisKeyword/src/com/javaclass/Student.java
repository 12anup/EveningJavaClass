package com.javaclass;

public class Student {
	int rollNo;
	String name;
	String college;
	Student(){
		System.out.println("Default Constructor");
	}
	Student(int rollNo, String name){
		this();
		System.out.println("Two Parameter");
		this.rollNo=rollNo;
		this.name = name;
	}
	Student(int rollNo, String name, String college){
		this(rollNo,name);
		System.out.println("Three Parameter");
		this.college=college;
		System.out.println(this);
//		this.display();
	}
	void display() {
		System.out.println("Roll Number:"+ this.rollNo);
		System.out.println("Name:"+this.name);
		System.out.println("College:"+this.college);
	}
	

}
