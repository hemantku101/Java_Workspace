package collection;
import java.util.HashSet;

public class HashSet01 {
	public static void main(String args[]) {
		//creating HashSet
		HashSet<Integer> hs=new HashSet<>();
		//adding elements
		hs.add(20);
		hs.add(46);
		hs.add(33);
		hs.add(16);
		hs.add(98);
		
		System.out.println(hs);
		//this method will check HashSet is empty or not
		System.out.println("HashSet is Empty or not checking "+hs.isEmpty());
		
		System.out.println(hs.remove(98));
		System.out.println(hs);
	}
}
