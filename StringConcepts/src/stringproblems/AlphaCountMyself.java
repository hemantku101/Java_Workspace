package stringproblems;

import java.util.HashMap;
import java.util.Scanner;

public class AlphaCountMyself {
	public static void charCount(String str) {
		char c[]=str.replaceAll("\\s","").toLowerCase().toCharArray();
		HashMap<Character, Integer> hm= new HashMap<>();
		
		for(char ch:c) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else
				hm.put(ch, 1);
		}
		System.out.println(hm);
	}
	public static void main(String ...args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s= sc.nextLine();
		charCount(s);
		sc.close();
	}
}
