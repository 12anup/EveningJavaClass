package switchexample;

import java.util.Scanner;

public class Calculator {
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
		switch (choice) {
		case 1:
			System.out.println("The sum of two numbers is:"+(a+b));
			break;
		case 2:
			System.out.println("The subtraction of two numbers is:"+(a-b));
			break;
		case 3:
			System.out.println("The division of two numbers is:"+ ((float)a/b));
			break;
		case 4:
			System.out.println("The multiplication of two numbers is:"+(a*b));
			break;

		default:
			System.out.println("invalid input");
			break;
		}
		
	}
}
