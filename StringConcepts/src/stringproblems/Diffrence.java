/*
 * String comparison using == operator equal()method
 * */
package stringproblems;

public class Diffrence {
	public static void checkThisMethod() {
		String s1="Hello";
		//String s2="Hello";
		String s2=new String("Hello");
		System.out.println("-----using == operator--------");
		if(s1 == s2) 
			System.out.println("Both are same");
		else
			System.out.println("Both are not same");
		System.out.println("======using equal()method=====");
		if(s1.equals(s2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
	}
	public static void main(String[] args) {
		checkThisMethod();
	}
}
