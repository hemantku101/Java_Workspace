package get_start_programs;

import java.util.Scanner;

public class EvenorOddNumber02 {
	public static void findEven(int n) {
		 if(n==0)
			System.out.println(n+" is zero");
		 else if(n%2==0) 
				System.out.println(n+" is even number");
		else
			System.out.println(n+" is not a even num or odd number");
	}
	public static void main(String ...arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int x=sc.nextInt();
		findEven(x);
		sc.close();
	}
}
