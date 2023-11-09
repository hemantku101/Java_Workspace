package stringproblems;

import java.util.Scanner;

public class SequanceCharacterThoseArePrimenumber {
static void count(String str) {
		int size = 128;

		int len = str.length();

		int count[] = new int[size];

		for (int i = 0; i < len; i++) {
			count[str.charAt(i)]++;
		}
		char ch[] = str.toCharArray();
		int find = 0;
		for (int i = 0; i < len; i++) {
			find = 0;
			
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j]) 
					find++;
			}
			if (find == 1) {
				//System.out.println( str.charAt(i) + " count is " + count[str.charAt(i)]);
				int c=1;
				for(int k=1;k<count[str.charAt(i)];k++) {
					if(count[str.charAt(i)]%k==0) {
						c++;
					}
				}
				if(c==2)
					System.out.println( str.charAt(i) + " count is " + count[str.charAt(i)]);
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		count(str);
		sc.close();
	}
}