package conditional;

public class ResultIfElse {

	public static void main(String[] args) {
		int english=56, math=70, social=80, nepali=78, science=90;
		int sumtotal=english+math+social+nepali+science;
		float percentage=(float)(sumtotal)/5;
		System.out.println(percentage);
		
		if(percentage>=80) {
			System.out.println("distinction");
		}
		else if(percentage>=60) {
			System.out.println("1ST div");
		}
		else if(percentage>=50) {
			System.out.println("2nd div");
		}
		else if(percentage>=32) {
			System.out.println("3rd div");
		}
		else {
			System.out.println("fail");
		}
		
		
		
		

	}

}
