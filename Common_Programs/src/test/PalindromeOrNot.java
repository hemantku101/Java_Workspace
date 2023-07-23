package test;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void check(int n) {
		int temp;
		int temp2=n;
		int rev=0;
		while(temp2 != 0) {
			temp=temp2%10;
			rev=rev*10+temp;
			temp2=temp2/10;
		}
		if (rev==n)
			System.out.println(n+" is a palindrome no");
		else
			System.out.println(n+" is not  a palindrome no");
		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Entera number to check");
		int n=s.nextInt();
		check(n);
		s.close();
	}
}
