package com;

import com.java.A;

public class C {

	public static void main(String[] args) {
		B bObj = new B();
		System.out.println(bObj.b);
		System.out.println(bObj.getB());
		
		A aObj = new A();
		System.out.println(aObj.a);
		System.out.println(aObj.getA());

	}

}
