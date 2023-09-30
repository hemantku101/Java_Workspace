package stream_progras;
//import java.util.ArrayList;

//Using Stream print Even and Odd 
import java.util.List;
import java.util.stream.Stream;
public class DemoProgram2 {
	public static void main(String[] args) {
		/*ArrayList<Integer> al =new ArrayList<>();
		al=(ArrayList<Integer>) List.of(1,5,4);
		System.out.println(al);
		* List is a immutable collection
		* becoz we can't type cast with others like ArrayList
		*/
		
		List<Integer> l=List.of(3,2,1,4,5,6); //factory method from java 8
		//l.add(20); List of is immutable object
		System.out.println(l);
		
		System.out.println("-----Stream Connect------");
		Stream<Integer> sm= l.stream();
		System.out.println("----Even Number----");
		System.out.println("----Using filter()----");
		sm.filter(x->x%2==0).forEach(y->System.out.println(y));
		
		System.out.println("-----Stream Connect------");
		Stream<Integer> sm1= l.stream();
		System.out.println("----Odd Number----");
		sm1.filter(x->x%2!=0).forEach(y->System.out.println(y));
		
		System.out.println("------");
		Stream<Integer> sm2= l.stream();
		Stream<Integer> a=sm2.filter(x->x%2!=0);
		//a.forEach(z->System.out.println(z));
		a.sorted().forEach(z->System.out.println(z));
		
		
	}
}
