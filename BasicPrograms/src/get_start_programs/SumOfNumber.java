package get_start_programs;

import java.util.Scanner;

public class SumOfNumber {
	public static void sumNum(int n) {
		int sum=0;
		while(n>=1) {
			int t=n%10;
			sum=t+sum;
			n=n/10;
		}
		if(sum>=9) {
			sumNum(sum);
		}
		else
			System.out.println(sum);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to sum");
		int n=sc.nextInt();
		sumNum(n);
		sc.close();
	}
}
