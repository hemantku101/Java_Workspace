//write a program to synchronize the threads acting on the same object. 
//The synchronized block in the program can be executed by only one thread at a time. 
package program;
//Thread synchronize - Two threads acting on same object
class Reserve01 implements Runnable{
	//available berths are 1
	int available=1;
	int wanted;
	
	//accept wanted berths at run time
	Reserve01(int i){
		wanted=i;
	}
	public void run() {
		synchronized(this)     //synchronize the current object
		{
			//display available  berths
			System.out.println("Available Berths= "+available);
			//if available berths are more than wanted berths
			if(available >= wanted) {
				//get the name of passenger
				String name= Thread.currentThread().getName();
				//allot the berth to him
				System.out.println(wanted + " Berths reserved for "+name);
				try {
					Thread.sleep(1500); //wait for printing the ticket
					available = available - wanted;
					//update the no. of available berths
				}catch(InterruptedException ie) {
					System.err.println(ie);
				}
			}
			//if available berths are less, display sorry
			else
				System.out.println("Sorry, no berths");
		} //end of synchronized block
	}
}
//main class
public class Demo11 {
	public static void main(String args[]) {
		//tell that 1 berth is needed
		Reserve01 obj = new Reserve01(1);
		
		//attach first thread to the object
		Thread t1 = new Thread(obj);
		//attach second thread to the same object
		Thread t2 = new Thread(obj);
		
		//take the thread names as persons names
		t1.setName("First person");
		t1.setName("Second person");
		//Send the requests for berth
		t1.start();
		t2.start();
	}
}
