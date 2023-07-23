//Write a program using predicate to know whether a given number is greater then 10 or not

//Predicate to test if a number is greater then 10
package lambda_expressions;

import java.util.function.Predicate;

public class Demo16 {
	public static void main(String args[]) {
		//Use predicate reference to show the lambda expression
		Predicate<Integer> gt = (i) -> i>10;
		
		//call test() method of Predicate that returns true or false
		boolean result = gt.test(18);
		System.out.println("Greater then 10: "+result);
	}
}
