package program;
// program in extends Thread
// develop multithreaded application
public class Demo4 extends Thread{
	@Override
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("Child Thread: "+i);
				Thread.sleep(1000);//1000 milliSeconds
			}
		}catch(Exception e) {
			System.err.println(e);
		}
	}
	public static void main(String args[]) {
		try {
			Demo4 d= new Demo4();
			d.start(); //implicitly super() is available
			for(int i=1;i<=10;i++) {
				System.out.println("Main Thread: "+i);
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}
