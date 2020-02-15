package oopexample;

public class Animal {
	String name;
	int age;
	String color;
	
	Animal(String name,int age,String color){
		this.name=name;
		this.age=age;
		this.color=color;
	}
	
	Animal(){
		
	}
	
    void display() {
		System.out.println("The name of animal is "+name +"age is "+age+"color is"+color);
	}
    
//    void display() {
//    	System.out.println("nothing to display");
//    }

	public static void main(String[] args) {
		Animal animal=new Animal(); //default constructor
		animal.name="cat";
		animal.age=2;
		animal.color="black";
		animal.display();
		Animal animal1=new Animal("Dog",4,"grey");
		animal1.display();		
	}

}
