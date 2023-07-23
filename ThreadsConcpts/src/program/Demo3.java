package program;
//Program to demonstrate sleep() method
public class Demo3 {
	public static void main(String args[]) {
		try {
			for(int i=0;i<=10;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}