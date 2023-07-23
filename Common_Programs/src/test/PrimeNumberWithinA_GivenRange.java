package test;
import java.util.Scanner;
public class PrimeNumberWithinA_GivenRange {
	
	public static void printPrime(int start,int end) {
		System.out.println("Printing prime number");
		for(int i=start;i<=end;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					count++;
			}//j loop end
			if(count == 2)
				System.out.println(i);
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers to print prime numbers");
		int start=s.nextInt();
		int end=s.nextInt();
		printPrime(start,end);
		System.out.println("Printing completed");
		s.close();
	}
}
