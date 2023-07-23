package array_programs;

public class SortEvenOdd {
	public static void sortEvenOdd(int arr[]) {
		int size=arr.length;
		int temp[]=new int [size];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				temp[count]=arr[i];
				count++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 !=0) {
				temp[count]=arr[i];
				count++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println();
		System.out.println(count);
	}
	public static void main(String args[]) {
		int arr[]= {15,19,22,3,4,5,6,7};
		sortEvenOdd(arr);
	}
}