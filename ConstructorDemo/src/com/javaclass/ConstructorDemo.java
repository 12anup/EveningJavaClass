package com.javaclass;

public class ConstructorDemo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.getName());
		Animal animal1 = new Animal("Cat");
		System.out.println(animal1.getName());
		Animal animal2 = new Animal("Mouse",2);
		System.out.println(animal2.getName());

	}

}
