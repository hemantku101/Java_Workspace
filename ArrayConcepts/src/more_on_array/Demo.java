package more_on_array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	public static void countMinSwap(int arr[]) {
		int max=0;int min=0;int count=0;
		//for(int i=0;i<arr.length;i++)
		{
//			for(int j=i+1;j<arr.length;j++){
//				if(arr[i]>arr[j])
//				{
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				count++;
//				}
//			}
//			max=arr[arr.length-1];
//			min=arr[0];
			int[] temp = Arrays.copyOfRange(arr, 0, arr.length);
			//int[] temp = arr;//count not working
			Arrays.sort(temp);
			int f=0;
			int l=arr.length-1;
			int k=0;
			//do 
			{
				//for(int k=0;k<arr.length;k++) 
				
				{
				//System.out.println(i+"=i");
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
				}
				k++;
			}
			while(arr[k] != temp[k]) ;
			{
				
			
		}
		}
		for(int ar:arr) {
			System.out.println(ar);
		}
		System.out.println("count ="+count);
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
		finally {
		System.out.println("final ");
		}
		
	}
}
