package test;
import java.util.Scanner;
public class GreatestNumberAmongThreeNumbers {
	public static int check(int a,int b,int c) {
		if(a>b && a>c)
			return a;
		if(b>a && b>c)
			return b;
		if(c>a && c>b)
			return c;
		if(a==b && b== c)
			System.out.println("Three are equal");
		return 0;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 number to check");
		int a= s.nextInt();
		int b= s.nextInt();
		int c= s.nextInt();
		System.out.println("checking...");
		System.out.println(check(a,b,c));
		System.out.println("task completed...");
		s.close();
	}
}
