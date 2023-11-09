package more_on_array;

import java.util.Scanner;

public class NumberSum {
	public static void wordSum(String arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int len=arr[i].length();
			System.out.print(len);
			sum+=len;
			if(i==arr.length-1)
				System.out.print("=");
			else
				System.out.print("+");
		}
		System.out.print(sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		System.out.println("Enter array elements");
		String str[]=new String [size];
		for(int i=0;i<size;i++) {
			str[i]=sc.next();
		}
		wordSum(str);
		sc.close();
	}
}
