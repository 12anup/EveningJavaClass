package override;

public class Result {

	public static void main(String[] args) {
		NIC nic=new NIC();
		System.out.println(nic.getRate());
		Nabil nabil=new Nabil();
		int nabilRate=nabil.getRate();
		System.out.println(nabilRate);
	}

}
