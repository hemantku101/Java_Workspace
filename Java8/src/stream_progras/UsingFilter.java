package stream_progras;
import java.util.ArrayList;
import java.util.stream.Stream;
public class UsingFilter {
	public static void main(String[] args) {
	ArrayList<Integer> al= new ArrayList<>();
	al.add(10);
	al.add(9);
	al.add(13);
	System.out.println(al);
	
	Stream<Integer> s= al.stream();
	
	s.sorted().forEach(t->System.out.println(t));
	
	}
}
