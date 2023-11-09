package more_on_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class UsingScannerAdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> al = new ArrayList<Integer>();
	System.out.println("Enter elements");
	System.out.println("(type '0' to finish)");
	
	 // Read input from the user until they type "exit"
    while (true) {
        int input = sc.nextInt();

        if (input==0) {
            break; // Exit the loop if the user types "0"
        }
        al.add(input); // Add the input to the ArrayList
    }
    System.out.println(al);
    sc.close();
	}
}