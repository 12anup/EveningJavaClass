package override;

public class AccessSpecifier {
	private String name;
	private String faculty;
	private int roll=45;
	
	public AccessSpecifier(String name,String faculty,int roll) {
		this.name=name;
		this.faculty=faculty;
		this.roll=roll;
	
	}
	public AccessSpecifier() {}
	
	
	public void display(){
		System.out.println("the name is "+name+"the faculty is :"+faculty+"the roll is"+roll);
	}
	
	public static void main(String[] args) {
		AccessSpecifier a=new AccessSpecifier("Ram","Science",1);
		a.display();

	}
}
