/*
 * For splitting a string into pieces whenever space is found
 * */
package stringproblems;

public class UsingSplit {
	public static void splitThisString(String str) {
		String s[];
		s=str.split(" ");
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
	public static void main(String[] args) {
		String str="Hello, this is a java book";
		splitThisString(str);
	}
}
