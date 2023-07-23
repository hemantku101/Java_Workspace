package program;
	//program to Demonstrate suspend() and resume() method
public class Demo6 extends Thread{
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
	@SuppressWarnings("removal")
	public static void main(String args[]) {
		try {
			Demo6 d= new Demo6();
			d.start(); //implicitly super() is available
			
			for(int i=1;i<=10;i++) {
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
				if(i==5)
					d.suspend();
				if(i==10)
					d.resume();
			}
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}