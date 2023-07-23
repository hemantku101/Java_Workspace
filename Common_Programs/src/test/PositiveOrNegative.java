package test;

import java.util.Scanner;
public class PositiveOrNegative {
	static String[] args;
	public static void check(int n) {
		//calling main method from another class
		ReverseOfA_Number.main(args);
		if(n<0)
			System.out.println(n+" is a negative number");
		if(n==0)
			System.out.println(n+" is Zero");
		if(n>0)
			System.out.println(n+" is positive number");
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number check number is positive or negative");
		int n=s.nextInt();
		System.out.println("checking");
		check(n);
		
	s.close();	
	}	
}
