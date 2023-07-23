//Write a program depicting a situation in which a deadlock can occur.
package program;

//Thread deadlock
class BookTicket extends Thread {
	//we are assuming train, compartment as objects
	Object train,comp;
	
	BookTicket(Object train, Object comp) {
		this.train = train;
		this.comp = comp;
	}//end constructor
	
	public void run() {
		//lock on train
		synchronized(train) {
			System.out.println("BookTicket locked on Train");
			try {
				Thread.sleep(150);
			}catch(InterruptedException ie) {
				System.err.println(ie);
			}//catch end
			System.out.println("BookTicket now waiting to lock on compartment..");
			synchronized(comp) {
				System.out.println("BookTicket locked on compatment");
			}//comp synchronized
		}//train synchronized
	}//end of run() method
}//end BookTicket class

class CancelTicket extends Thread {
	//we are assuming train, compartment as objects
	Object train,comp;
	
	CancelTicket(Object train,Object comp){
		this.train = train;
		this.comp = comp;
	}//constructor
	public void run() {
		//lock on compartment
		synchronized(comp) {
			System.out.println("CancelTicket locked on compartment");
			try {
				Thread.sleep(200);
			}catch(InterruptedException ie) {
				System.err.println(ie);
			}//end catch
			System.out.println("CancleTicket now waiting to lock on train..");
			synchronized(train) {
				System.out.println("CancleTicket locked on train");
			}//synchronized train
		}//synchronized comp
	}//end of run() method
}//end of CancelTicket class
public class Deadlock {
	public static void main(String args[]) {
		//take train, compartment as objects of object class
		Object train = new Object();
		Object compartment = new Object();
		
		//create objects to BookTicket, CancelTicket classes
		BookTicket obj1 = new BookTicket (train,compartment);
		CancelTicket obj2 = new CancelTicket (train,compartment);
		//attach 2 threads to these objects
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		//run the threads on the objects
		t1.start();
		t2.start();
	}//end of main method
}//end on main class
