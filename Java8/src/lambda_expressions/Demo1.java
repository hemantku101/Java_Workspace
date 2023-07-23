//Program to demonstrate Lambda expression
package lambda_expressions;
//create a functional interface with a single abstract method
@FunctionalInterface
 interface Test {
	void show();
}

public class Demo1 {
	public static void main(String args[])
	{
		//create functionalInterface reference that refers to lambda expression
		Test t=()->System.out.println("Welcome");
		//call the method using reference
		t.show();
	}
}