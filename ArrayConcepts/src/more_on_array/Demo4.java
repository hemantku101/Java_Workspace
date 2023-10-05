package more_on_array;

public class Demo4 {
	public  int changeEle(int[] arr, int ele)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return i;
			}
		}
		for(int ar:arr)
			System.out.println(ar);
		return -1;
		
	}
	public static void main(String[] args) {
		int []arr= {4,3,2,1};
		Demo4 r= new Demo4();
		System.out.println(r.changeEle(arr,5));
	}
}
