package test;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void factorialNum(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a numbers");
		int n=s.nextInt();
		factorialNum(n);
		System.out.println("Printing completed");
		s.close();
	}
}
