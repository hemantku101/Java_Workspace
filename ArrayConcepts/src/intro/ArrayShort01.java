package intro;

import java.util.Scanner;

public class ArrayShort01 {
	public static void sortArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length/2;j++) {
			if(arr[i] > arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
			for(int j=arr.length/2;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int arra[]= {1,45,99,5,7,10,90};
		//int []arra=new int[5];
		
//		System.out.println("Enter Array elements");
//		for(int i=0;i<5;i++) {
//			arra[i]=sc.nextInt();
//		}
		sortArr(arra);
		sc.close();
	}
}		