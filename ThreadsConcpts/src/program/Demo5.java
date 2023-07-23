package program;
//program in extends Thread
//develop multithreaded application
public class Demo5 extends Thread {
	@Override
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(getName()+":"+i);
				if(getName().equals("Child Thread1")) {	
				System.out.println("if");
				//System.out.println("Child Thread: "+i);
				Thread.sleep(1000);//1000 milliSeconds
				}
				else {
					Thread.sleep(3000);
					System.out.println("else");}
			}
		}catch(Exception e) {
			System.err.println(e);
		}
	}
	public static void main(String args[]) {
		try {
			Demo5 d= new Demo5();
			d.setName("Child Thread1");
			d.start(); //implicitly super() is available
			Demo5 d2=new Demo5();
			d2.setName("Child Thread2");
			d2.start();
			for(int i=1;i<=10;i++) {
				System.out.println("Main Thread: "+i);
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}