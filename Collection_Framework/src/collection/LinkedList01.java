package collection;
import java.util.LinkedList;
public class LinkedList01 {
	public static void main(String args[])
	{
		//create LinkedList
		LinkedList<Integer> ll=new LinkedList<>();//It allow only integer type data
		//adding elements
		ll.add(23);
		ll.add(43);
		ll.add(83);
		ll.add(56);
		//adding element
		ll.offer(60);
		ll.add(87);
		//adding last position
		ll.offerLast(80);
		ll.add(83);
		
		//adding first index position
		ll.addFirst(67);
		//adding last index position
		ll.addLast(10);
		
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
	}

}
