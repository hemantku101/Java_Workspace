package more_on_programs;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveRepeatedElements {
	public static void main(String args[]) {
		ArrayList<String> al= new ArrayList<>();
		al.add("hello");
		al.add("hii");
		al.add("hello");
		//HashSet will removes duplicate elements
		HashSet<String> hs= new HashSet<>(al);
		ArrayList<String> al1=new ArrayList<>(hs);
		System.out.println(al1);
		
	}
}
