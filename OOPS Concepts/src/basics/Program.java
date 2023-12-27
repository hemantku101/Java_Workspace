package basics;

class Animal{//Base class
	public Animal(){
		System.out.println("Base Constructor");
	}
}
class Cat extends Animal{//Derived class
	public Cat(){	
		System.out.println("Derived Constructor");		
	}
}
public class Program {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Cat c = new Cat();   
	}
}
