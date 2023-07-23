package stringproblems;

import java.util.Scanner;

public class AlphaCount {
	static void count(String str) {
		int size = 256;

		int len = str.length();

		int count[] = new int[size];

		for (int i = 0; i < len; i++) {
			count[str.charAt(i)]++;
		}
		
		char ch[] = new char[len];
		int find = 0;
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			find = 0;
			
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1) {
				System.out.println( str.charAt(i) + " count is " + count[str.charAt(i)]);
			}

			if (find > 0) {
				int count2 = 0;
				for (int k = 1; k <= count[str.charAt(i)]; k++) {

					if (count[str.charAt(i)] % k == 0) {
						count2++;
						// System.out.println(count2);
						if (count2 > 1 && count2 < 3) {

						}

					}
				}
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
