/* 
 * Take a string and copy some some of characters of the string into a 
 * character array using getChar() method
 * 
 * */

package stringproblems;

public class UsingGetCharMethod {
	public static void convChar(String str) {
		char arr[]=new char[20];
		
		str.getChars(7, 21, arr, 0);
		System.out.println(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main (String args[]) {
		String str = "Hello, this is a book on java";
		convChar(str);
	}
}