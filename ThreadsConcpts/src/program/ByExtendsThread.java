package program;
// program in extends Thread
// develop multithreaded application
public class ByExtendsThread extends Thread{
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
			ByExtendsThread d= new ByExtendsThread();
			d.start(); //implicitly super() is available
			//start() method implicitly call run() method
			for(int i=1;i<=10;i++) {
				System.out.println("Main Thread: "+i);
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}
