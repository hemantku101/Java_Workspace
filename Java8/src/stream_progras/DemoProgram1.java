package stream_progras;

//Stream using Normal Array

import java.util.Arrays;
import java.util.stream.Stream;

public class DemoProgram1 {
	public static void main(String[] args) {
		System.out.println("--ArrayStream----");
		Integer arr[]= {9,4,2,11,7};
	//a[] is not a collection becoz, Arrays through we connected stream
		Stream<Integer> s= Arrays.stream(arr);
		s.forEach(t->System.out.println(t));
		
		System.out.println("-----reduce()-----");
		Stream<Integer> s1= Arrays.stream(arr);

		int total=s1.reduce(1,(a,b)->a+b);
		//'a' is takes 1
		//'b' is takes array elements
		System.out.println(total);
		
		
		
	}
	
}
