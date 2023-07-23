package test;
import java.util.Scanner;
public class LeepYear {
	public static void check(int year) {
		if (year % 400 == 0)
		       System.out.println (year + " is a Leap Year1");

		     else if (year % 4 == 0 && year % 100 != 0)
		       System.out.println (year + " is a Leap Year2");

		     else
		         System.out.println (year + " is not a Leap Year");
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		check(num);
		s.close();
	}
}
