package more_on_array;

import java.util.Scanner;

public class Demo1 {
	
	public static void countMinSwap(int arr[]) {
		int max=0;int min=0;int count=0;
		int f=0;
		int l=arr.length-1;
		int k=0;
		 
	for(int ar:arr) {
		System.out.println(ar);
	}if(k==arr.length) {
		System.out.println();
	}
	else
	System.out.println("count ="+checkSwap(arr,f,l,k,max,min,count));
}
	public static int checkSwap(int arr[],int f,int l,int k,int max,int min,int count) {
		for(int j=k;j<arr.length;j++) {
			if(max<arr[j])
				max=arr[j];
			else
				min=arr[j];
		}
		//System.out.println(max+" " +min);
		if(arr[f]==min)
			System.out.println();
		else
			arr[f]=min;
		if(arr[l]==max)
			System.out.println();
		else {
			arr[l]=max;
			count++;
		}
		f++;
		l--;
		k++;
		return count;
	}
	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Array Size");
			int size=sc.nextInt();
			System.out.println("Enter Array Elements");
			int arr[]=new int[size];
			for(int i=0;i<size;i++) 
				arr[i]=sc.nextInt();
			countMinSwap(arr);
			sc.close();
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}
