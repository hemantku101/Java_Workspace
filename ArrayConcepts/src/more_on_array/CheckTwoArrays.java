package more_on_array;

import java.util.Scanner;

public class CheckTwoArrays {
	public static void checkMissingElement(int arr[],int []arr2) {
		int mis=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i] != arr2[j]) {
					mis=arr[i];
				}
				else
					mis=0;
			}
			System.out.println(mis);
		}
		//System.out.println(mis);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st Array size");
		int size= sc.nextInt();
		System.out.println("Enter 2nd Array size");
		int size2=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter 1st Array Elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int arr2[]=new int[size2];
		System.out.println("Enter 2nd Array Elements");
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		checkMissingElement(arr,arr2);
	}
}
