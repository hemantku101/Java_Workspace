//Write a program to access variables of a class and of a method using 
//lambda expression

package lambda_expressions;
//A lambda expression that accesses the variables with class scope and method scope
public class Demo7 {
	//variable in the class
	int x = 10;
	
	//method in the class
	void method() {
		//variable in the method
		int x = 20;
		
		//create reference of FunctionalInterface to the lambda expression
		Runnable r = () ->{ System.out.println("Variable of class "+ this.x);
		System.out.println("Variable of method " + x);};
		
		//create a thread and run it
		Thread t = new Thread(r);
		t.start();
	}//method end
	public static void main(String args[]) {
		//class object to the class and call the method
		Demo7 obj = new Demo7();
		obj.method();
	}
}