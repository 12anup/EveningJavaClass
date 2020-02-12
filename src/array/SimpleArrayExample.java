package array;

import java.util.Arrays;

public class SimpleArrayExample {

	public static void main(String[] args) {
		String []students= {"ram","hari","sita","gita","abc"};
//		System.out.println(students.length);
		for(int a=0;a<students.length;a++) {
			System.out.println(students[a]);
//			System.out.println(Arrays.toString(students));
		}
		
		students[0]="xyz";
		
		for(int a=0;a<students.length;a++) {
			System.out.println(students[a]);
//			System.out.println(Arrays.toString(students));
		}
		
		

	}

}
