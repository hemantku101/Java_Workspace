package collection;
import java.util.ArrayList;
public class ArrayList03 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("James Gosling");
		al.add("Patrick ");
		al.add("aaaaa");
		al.add("Mike sheridan");
		System.out.println(al);
		
		//adding index wise elements
		al.add(2,"Chris warth");
		
		System.out.println(al);
		
		//changing index elements
		al.set(3, "Ed Frank");
		System.out.println(al);
		
		System.out.println("position wise elements is -"+al.get(0));
		
		//
		for(String s : al) {
			System.out.println(s);
		}
	}
}
