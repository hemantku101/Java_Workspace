package more_on_array;
//if arr[]={6,0,3,10}=180

import java.util.Scanner;

public class SubArrayProduct {
	public static void findSubArrayProduct(int arr[]) {
		int max=0;
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				for(int k=j+1;k<len;k++) {
					int temp=arr[i]*arr[j]*arr[k];
					if(temp>max)
						max=temp;
				}
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		findSubArrayProduct(arr);
		sc.close();
	}
}
