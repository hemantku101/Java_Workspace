//Write a java program to create a predicate that display all numbers and even numbers from a group of given numbers

//Predicate to display all numbers and even numbers
package lambda_expressions;


import java.util.function.Predicate;

public class Demo17 {
	public static void main(String args[]) {
		//take a group of Integer objects in an array
		Integer []arr = {8,9,10,11,12,13,14,15};
		
		//create predicate references
		Predicate<Integer> all, evens;
		
		//lambda expression to return true upon taking a number
		all = (n) -> true;
		
		//lambda expression to return true if it is even number
		evens = (n) -> n%2==0;
		
		System.out.println("All numbers: ");
		display(all, arr);
		
		System.out.println("\n Even numbers: ");
		display(evens,arr);
	}
	static void display(Predicate<Integer> p, Integer []arr) {
		for(Integer i: arr)
			if(p.test(i)) System.out.println(i+" ");
	}
}
