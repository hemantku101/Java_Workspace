package stringproblems;

public class CheckLargeWord {
	public static void findLarge(String str) {
		String s=null;
		@SuppressWarnings("unused")
		String big=null;
		int length1=0;
		int len2=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				length1=s.length();
				if(length1>len2) {
					big=s;
				}
				
				s=null;
			}
			else {
				s=str.charAt(i)+s;
			}
		}
	}
	public static void main(String args[]) {
		String str="Hello everyone what is this";
		findLarge(str);
	}
}
