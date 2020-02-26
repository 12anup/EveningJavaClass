package com.javaclass;

public class Animal {
	String name;
	
	{
		
		System.out.println("Block Statement");
	}
	
	Animal() {
		this.name = "Dog";
		System.out.println("Default Constructor Called");
	}
	Animal(String name){
		this.name = name;
		System.out.println("This is Paramiterized Constructor");
	}
	Animal(String name, int a){
		this.name = name;
		System.out.println("This is Paramiterized Constructor with a");
	}
	String getName() {
		return name;
	}

}
