package test;
import java.util.Scanner;
//0 1 1 2 3 5
public class FibonacciSeries {
	public static void printFibo(int n) {
		int a=0;int b=1;
		System.out.print(a+" ");
		for(int i=2;i<=n;i++){
			int t=a+b;
			System.out.print(t+" ");
			
			b=a;
			a=t;
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		printFibo(n);
		s.close();
	}
}
