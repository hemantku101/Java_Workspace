package test;
import java.util.Scanner;
public class ArmstrongNumberCheck {
	public static void check(int n) {
		int digit=digitCheck(n);
		int temp2=n;
		int sum=0;
		
		while(temp2 != 0) {
			int y = temp2 % 10;
			int temp=1;
			int d=digit;
			
		while(d != 0) {
			temp=temp*y;
			d--;
		}
		temp2=temp2/10;
		sum=sum+temp;
		}

		if(sum == n)
			System.out.println(n+" is ArmstrongNumber");
		else
			System.out.println(n+" is not ArmstrongNumber");
	}
	
	public static int digitCheck(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Entera number to check");
		int n=s.nextInt();
		check(n);
		s.close();
	}
}
