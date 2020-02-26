package conditional;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		String result="";
		boolean res;
		if (a<32) {
			if(a<10) {
			result="fail";
			}
			else {
				System.out.println(" pass with additional marks");
			}
			
		}
		else {
			result="pass";
		}
		System.out.println(result);
		
		result=a>=32?"pass":"fail";
		res=a>=32?true:false;
		System.out.println(result);
		System.out.println(res);
		
		System.out.println("My name is Ram");		

	}

}
