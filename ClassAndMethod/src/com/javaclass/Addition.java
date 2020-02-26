package com.javaclass;

public class Addition {
	
	//method
	int add(int a , int b) { //int a = 12; int b = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(subtract(a,b));
		return a+b;
	}
	
	int subtract(int a,int b) {
		return a-b;
	}

}
