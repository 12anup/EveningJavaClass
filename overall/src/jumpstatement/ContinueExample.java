package jumpstatement;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=0;i<50;i++) {
			if(i==20) {
				continue;
			}
			System.out.println(i);
		}

	}

}
