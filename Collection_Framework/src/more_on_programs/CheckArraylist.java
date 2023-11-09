package more_on_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckArraylist {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		while (true) {
	        String input = sc.next();

	        if (input=="0") {
	            break; // Exit the loop if the user types "0"
	        }
	        al.add(input); // Add the input to the ArrayList
	    }
	}
}
