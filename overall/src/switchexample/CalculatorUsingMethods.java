package switchexample;

import java.util.Scanner;

public class CalculatorUsingMethods {
	
	static int add(int a,int b) {
		return a+b;
	}
	static int subtract(int a,int b) {
		return a-b;
	}
	static int multiply(int a,int b) {
		return a*b;
	}
	static int divide(int a,int b) {
		return a/b;
	}
	public static void main(String []args) {
		System.out.println("Please choose a number: \n");
		System.out.println("Press 1 to add ");
		System.out.println("Press 2 to subtract ");
		System.out.println("Press 3 to divide ");
		System.out.println("Press 4 to multiply ");
		System.out.println("Press any other to exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int result=0;
		switch (choice) {
		case 1:
			result=add(a, b);
			break;
		case 2:
			result=subtract(a, b);
			break;
		case 3:
			result=divide(a, b);
			break;
		case 4:
			result=multiply(a, b);
			break;

		default:
			System.out.println("invalid input");
			break;
		}
		System.out.println("The required result is"+ result);
		
	}
}
