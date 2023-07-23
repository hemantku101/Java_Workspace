package collection;

import java.util.ArrayList;

public class ArrayList01 {
	@SuppressWarnings({"rawtypes","unchecked"})
	public static void main(String args[])
	{
		//create ArrayList
		ArrayList al=new ArrayList();
		
		//add objects
		al.add(45);
		al.add(83);
		al.add(120);
		al.add(15);
		al.add(35);
		//display contains
		System.out.println(al);
		
		al.add(0, 30);
		//all collection object added
		al.addAll(al);
		
		System.out.println(al.contains(10));
		al.addAll(al);
		
		System.out.println(al.equals(al));
		
		System.out.println(al);
		
		System.out.println("index 2 value is "+al.get(2));
		
		System.out.println("HashCode "+al.hashCode());
		//remove element
		System.out.println(al.remove(2));
		System.out.println(al);
		
		System.out.println(al.set(3, 40));
		System.out.println(al);
		
		System.out.println(al.clone());
		System.out.println(al);
		
		//it will remove all elements from ArrayList
		al.clear();
		System.out.println(al);
		
	}
}
