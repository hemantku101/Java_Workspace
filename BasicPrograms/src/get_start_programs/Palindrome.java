package get_start_programs;

import java.util.Scanner;

public class Palindrome {
	public static void checkPalindrom(int a) {
		int temp=a;int rev=0;
	
		while(temp>0) {
		
			int k=temp%10;
			 rev=(rev*10)+k;
			 temp=temp/10;
		}
		if(rev==a) {
			System.out.println("is pally"+a);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		checkPalindrom(num);
		sc.close();
	}
}
