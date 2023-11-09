package get_start_programs;

import java.util.Scanner;

public class Count_2s_from_N {
	public static int countNum(int n) {
		int count=1;
		for(int i=0;i<=n;i++) {
			int m=i%10;
			int d=i/10;
			if(m==2) {
				count++;
			}
			if(d==2) {
				count++;
			}	
		}	
		return count;
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number for count");
		int num=sc.nextInt();
		System.out.println(countNum(num));
		sc.close();
	}
}
