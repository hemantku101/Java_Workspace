package classprograms;

import java.util.StringTokenizer;

public class StrTokensCountWords {
	public static void main(String args[]) {
		String s="Welcome to java";
		StringTokenizer st= new StringTokenizer(s);
		//It will count no of tokens or no of words
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			//It will print each tokens
			System.out.println(st.nextToken());
		}
	}
}