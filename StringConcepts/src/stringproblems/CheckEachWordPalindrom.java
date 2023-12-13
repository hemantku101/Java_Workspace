package stringproblems;
import java.util.Scanner;
public class CheckEachWordPalindrom {
	
	public static void checkEach(String str) {
		for(String word : str.split(" ")) {
			String temp="";
			for(int i=word.length()-1;i>=0;i--) {
				temp+=word.charAt(i);
			}
			
			if(word.equals(temp)) {
				System.out.println(word);
			}
		}
	}
//	public static void chechIf(String str) {
//		for(int i=0;i<str.length();i++) {
//			if(' '==str.charAt(i)) {
//				
//			}
//		}
//	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line to check");
		String str=sc.nextLine();
		checkEach(str);
		sc.close();
	}
}
