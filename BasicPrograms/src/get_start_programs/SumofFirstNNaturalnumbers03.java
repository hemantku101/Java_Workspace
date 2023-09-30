package get_start_programs;

import java.util.Scanner;

public class SumofFirstNNaturalnumbers03 {
	public int sumNaturalNum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String ...a) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter a number to sum");
			int x=sc.nextInt();
SumofFirstNNaturalnumbers03 r=new SumofFirstNNaturalnumbers03();
			System.out.println(r.sumNaturalNum(x));
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}
