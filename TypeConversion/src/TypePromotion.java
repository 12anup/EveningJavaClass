
public class TypePromotion {

	public static void main(String[] args) {
		long a = 12;
		int b = 3;
		int sum = b+(int)a; // cast long to int before sum to prevent type promotion
		long sum2 = a+b; //a is promoted to long
		int sum1 = (int)(b+a); //casting long result to integer
		
		float c = 12.43f;
		
		float sum3 = a+b+c;
		long sum4 = (long) (a+b+c);
		int sum5 = (int) (a+b+c);
		
		
		// if there is upper level data type is any expression then it promoted all the datatype of expression to the upper level
		// in that case if we need lower level data type the we need to explicitly cast result to required type
		// higher to lower level
		// double float long int char short byte

	}

}
