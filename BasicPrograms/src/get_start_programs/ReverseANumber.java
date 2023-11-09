package get_start_programs;

import java.util.Scanner;
//this was not working properly for decimal values
public class ReverseANumber {
	public static void reverseAnyNum(double num) {
		double rev=0;
		while (num != 0) {
            double digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10; // Remove the last digit
        }
		System.out.println(rev);
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a doule number only");
		double n=sc.nextDouble();
		reverseAnyNum(n);
		sc.close();
	}
}
