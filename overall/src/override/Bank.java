package override;

public class Bank {
	public int getRate() {
		return 0;
	}
	
	public static void main(String[] args) {
		AccessSpecifier a=new AccessSpecifier("Shyam","mgmt",4);
		a.display();

	}

}
