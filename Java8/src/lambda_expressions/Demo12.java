/* Write a program to understand how to refer to a particular default
 * method when the same method is found in two interface  */
package lambda_expressions;
//two interface with same default method
interface One {
	default void message() {
		System.out.println("Hello from One");
	}
}
interface Two {
	default void message() {
		System.out.println("Hello from Two");
	}
}
class Implclas implements One, Two{
	//override the message() method to resolve the confusion
	public void message() {
		Two.super.message(); 	//this will call Two's message
	}
}
public class Demo12 {
	public static void main(String args[]) {
		//create implementation class object
		Implclas ic = new Implclas();
		ic.message();
	}
}
