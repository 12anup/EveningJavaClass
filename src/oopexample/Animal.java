package oopexample;

public class Animal {
	String name;
	int age;
	String color;
	
	Animal(String n,int a,String c){
		name=n;
		age=a;
		color=c;
	}
	
	Animal(){
		
	}
	
    void display(Animal a) {
		System.out.println("The name of animal is "+a.name +"age is "+a.age+"color is"+a.color);
	}

	public static void main(String[] args) {
		Animal animal=new Animal(); //default constructor
		animal.name="cat";
		animal.age=2;
		animal.color="black";
		animal.display(animal);
		Animal animal1=new Animal("Dog",4,"grey");
		animal1.display(animal1);

	}

}
