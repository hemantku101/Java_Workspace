//Write a program to create and execute a lambda expression that adds two integers.

//create a lambda expression to find sum of two integers
package lambda_expressions;
//create a FunctionalInterface with single abstract method
@FunctionalInterface
 interface Test01 {
	int add(int a,int b);
}
//create a lambda expression to find sum of two integer
public class Demo2 {
	public static void main(String args[])
	{
		//create FunctionalInterface reference that refers to lambda expression
		Test01 t=(a,b)->a+b;
		//call the method using reference
		int x=t.add(24,25);
		System.out.println(x);
	}
}