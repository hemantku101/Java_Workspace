package stringproblems;

public class StringTOArray {
public static void main(String[] args) {
	String str="hello";
	char c[]=str.toCharArray();
	
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
}
}
