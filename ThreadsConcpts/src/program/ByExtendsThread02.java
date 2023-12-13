package program;

public class ByExtendsThread02 extends Thread{
	public void run() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		ByExtendsThread02 m= new ByExtendsThread02();
		Thread t=new Thread(m);
		t.start();			
	}
}
