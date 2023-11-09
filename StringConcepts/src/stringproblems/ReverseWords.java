package stringproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {
	public static void revWords(String str) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		String word="";int len=str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)!=' ') {
				word+=str.charAt(i);
			}
			 if(str.charAt(i)==' ') {
				
				al.add(word);
				word="";
				al.add(" ");
			}
			if(i==len-1) {
				al.add(word);
			}
		}
			System.out.println(al);
//		for(int i=al.size()-1;i>=1;i--) {
//			//System.out.println(al.get(i));
//			if(al.get(i)==" " && al.get(i-1)==" ") {
//				i--;
//				System.out.println("#");
//			}
//			else
//				System.out.print(al.get(i));
//		}
			 List<String> o = filterEmptyStrings(al);
			 for(int i=o.size()-1;i>=1;i--) {
				 System.out.print(o.get(i));
			 }
			 //System.out.println(o);

	}
	 public static List<String> filterEmptyStrings(List<String> input) {
	        List<String> result = new ArrayList<>();

	        for (String str : input) {
	            if (!str.trim().isEmpty()) {
	                result.add(str);
	            }
	        }

	        return result;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		revWords(s);
		sc.close();
	}
}
