/*Write a java program to create a lambda expression that 
calculates and returns the square root value of a given number */

// A lambda expression that returns square root value of a number
package lambda_expressions;

public class Demo3 {
	//create a FunctionalInterface with a single abstract method
	@FunctionalInterface
	interface MyInter{
		double squareroot(double num);
	}
	public static void main(String args[]) {
		//create FunctionalInterface reference that refers to lambda expression
		MyInter mi = (double x) -> { return Math.sqrt(x);};
		
		//call the method using reference
		System.out.println("Square root of 256 = "+ mi.squareroot(256));
	}
}
