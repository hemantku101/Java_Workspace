package stringproblems;

//import java.util.Scanner;

public class RevreseAString {
	public static void revStr(String str) {
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			s+=str.charAt(i);
		}
		System.out.println(s);
	}
	public static void main(String args[]) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		revStr(str);
		sc.close();
	}
}