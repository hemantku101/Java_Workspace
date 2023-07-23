package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList02 {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) throws IOException {
		
		//creating an empty linkedList to store strings
		LinkedList<String> ll = new LinkedList<>();
		
		//adding elements to linkedList
		ll.add("America");
		ll.add("India");
		ll.add("Japan");
		
		//display the elements in linkedLIst
		System.out.println("LinkedList = "+ll);
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String element;
		int position;
		int choice=0;
		
		while(choice<4) {
			System.out.println("/n LinkedList Operations");
			System.out.println("1 Add an element");
			System.out.println("2 Remove an element");
			System.out.println("3 Change an element");
			System.out.println("4 Exit");
			
			System.out.print("Your Choice: ");
			choice=Integer.parseInt(br.readLine());
			
			switch(choice) {
			
			case 1: System.out.print("Enter Element");
					element = br.readLine();
					System.out.print("At what position? ");
					position = Integer.parseInt(br.readLine());
					ll.add(position-1,element);
					break;
					
			case 2: System.out.print("Enter position");
					position = Integer.parseInt(br.readLine());
					ll.remove(position-1);
					break;
					
			case 3: System.out.print("Enter position");
					position = Integer.parseInt(br.readLine());
					System.out.print("Enter New element: ");
					element = br.readLine();
					ll.set(position-1, element);
					break;
					
			default: return;
			}
			//user Iterator to retrieve the elements
			System.out.print("LinkedList = ");
			Iterator it = ll.iterator();
			while(it.hasNext())
				System.out.print(it.next()+" ");
		}//end of while
		
	}
}