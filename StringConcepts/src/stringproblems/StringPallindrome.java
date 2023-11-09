package stringproblems;

import java.util.Scanner;

public class StringPallindrome {
	public static void checkPallindrome(String str) {
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp+=str.charAt(i);
		}
		//to check equal or not
		if(str.equals(temp))
			System.out.println(str+" Is a pallindrome");
		else
			System.out.println(str+" Is not a pallindrome");
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to check pallindrome");
		String str=sc.next();
		checkPallindrome(str);
		sc.close();
	}
}
