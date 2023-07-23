package intro;

public class Array02 {
	public static int secondLarge(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		return arr[arr.length-2];
	}
	public static void main(String[] args) {
		int arr[]= {55,44,65,23,63,45,26,99};
		System.out.println("Second largest number:"+secondLarge(arr));;
	}
}
