package com.javaclass;

import com.javaclass.one.ClassA;

public class ClassC extends ClassA{
	int b = 20;
	void sum() {
		System.out.println("Sum :"+(getA()+b));
	}
}
