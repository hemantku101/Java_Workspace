package get_start_programs;

import java.util.Scanner;

public class PrimePalindrom {
	public static void checkPrime(int n) {
		int k=0;
		int a=2;
		while(k<n) {
			int count=0;
			for(int i=1;i<=a;i++) {
				if(a%i==0) 
					count++;
			}
			if(count==2) {
				int t=checkPalindrom(a);
				if(t>0) {
					k++;
					System.out.println(a);
				}
				a++;
			}
				a++;
		}
	}
	public static int checkPalindrom(int a) {
		int temp=a;int rev=0;
		while(temp>0) {
			int k=temp%10;
			 rev=(rev*10)+k;
			 temp=temp/10;
		}
		if(rev==a) 
			return rev;
		else
			return 0;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		checkPrime(num);
		sc.close();
	}
}