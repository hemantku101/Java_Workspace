package more_on_array;

import java.io.*;
import java.util.*;
class Mai {
	
	public int minSwaps(int[] arr,int s)
	{
		int ans = 0;
		//This method creates a copy of elements, within a specified range of the original array.
		int[] temp = Arrays.copyOfRange(arr, 0, s);
		//int[] temp = arr;//count not working
		Arrays.sort(temp);
		for (int i = 0; i < s; i++) {

			// This is checking whether
			// the current element is
			// at the right place or not
			if (arr[i] != temp[i]) {
				ans++;
				//System.out.println(ans+" = main count");
				// Swap the current element
				// with the right index
				// so that arr[0] to arr[i] is sorted
				swap(arr, i, changeEle(arr, temp[i]));
			}
		}
		return ans;
	}
	public void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println("swap");
	}
	
	public int changeEle(int[] arr, int ele)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return i;
			}
		}
		
		return -1;
		
	}
}

public class Demo3 {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		System.out.println("Enter Array Elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) 
			arr[i]=sc.nextInt();
		System.out.println("count = "+new Mai().minSwaps(arr, size));
//		for(int ar:arr)
//			System.out.println(ar);
		sc.close();
	}
}
// This code is contributed by Satvik Nema
