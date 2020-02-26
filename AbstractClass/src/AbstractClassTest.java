
public class AbstractClassTest {

	public static void main(String[] args) {
		
		Bank nabil = new Nabil();
		
		Bank prabhu = new Prabhu();
		
		System.out.println(nabil.getExchangeRate());
		System.out.println(prabhu.getExchangeRate());
		System.out.println(nabil.getLoneRate());
		System.out.println(prabhu.getLoneRate());
//		 we canot create bank object because it is an abstract class
//		Bank b = new Bank();
	}

}
