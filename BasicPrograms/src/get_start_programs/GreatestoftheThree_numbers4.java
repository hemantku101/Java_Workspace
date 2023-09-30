package get_start_programs;

import java.util.Scanner;

public class GreatestoftheThree_numbers4 {
	public int findBig(int a,int b,int c) {
		int big=0;
		if(a>b && a>c)
			big = a;
		else if(b>a && b>c)
			big = b;
		else if(c>a && c>b)
			big = c;
		return big;
	}
	public static void main(String ...args) {
		try(Scanner s= new Scanner(System.in)){
			
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}
