package get_start_programs;

import java.util.Scanner;

public class PositiveorNegativenumber01 {
	public static void checkNum(int x) {
		if(x==0)
			System.out.println(x+" is zero ");
		else if(x<0)
			System.out.println(x+" is negative number");
		else if(x>0)
			System.out.println(x+" is a positive number");
		else
			System.out.println(x+" is not a number");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int x=sc.nextInt();
		checkNum(x);
		sc.close();
	}
	
}
