package intro;

public class FrequencyOfElementsInAnArray {
	public static void frequencyOfElements(int arr[]) {
		int count[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {55,44,55,65,45,23,63,45,65,99};
		frequencyOfElements(arr);
	}
}
