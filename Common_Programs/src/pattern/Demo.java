package pattern;

public class Demo {
public static void main(String[] args) {
	for(int i=4;i>=1;i--) {
		for(int j=1;j<=4;j++) {
			if(j==i || j>i) {
				System.out.print("1");
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
/*
   1
  11
 111
1111
*/