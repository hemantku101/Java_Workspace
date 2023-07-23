package test;
import java.util.Scanner;
public class ReverseOfA_Number {
	public static int reverse(int n) {
		int temp;
		int rev=0;
		while(n!=0) {
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		return rev;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Entera number to reverse");
		int n=s.nextInt();
		System.out.println(reverse(n));
		s.close();
	}
}
