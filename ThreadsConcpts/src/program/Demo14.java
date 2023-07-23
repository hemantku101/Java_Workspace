//Write a program such that the Consumer thread is informed 
//immediately when the data production is over

/* This program shows how to use wait and notify 
 * This is the most efficient way of thread communication */
package program;

public class Demo14 {
	public static void main(String args[]) throws Exception {
		// Producer produces some data which consumer consumes
		Producer01 obj1 = new Producer01();
		// Pass Producer object to Consumer so that it is then available to consumer
		Consumer01 obj2 = new Consumer01(obj1);
		// create 2 Threads and attach to Producer and Consumer
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		// Run the threads
		t2.start(); // Consumer waits
		t1.start(); // Producer start Production
	}// end of main method
}// Demo14 class end

class Producer01 extends Thread {
	// to add data, we use StringBuffer object
	StringBuffer sb;

	// dataprodover will be true when data production is over
	boolean dataprodover = false;

	Producer01() {
		sb = new StringBuffer(); // allot memory
	}

	public void run() {
		synchronized (sb) {
			// go on appending data (numbers) to stringBuffer
			for (int i = 1; i <= 10; i++) {
				try {
					sb.append(i + ":");
					Thread.sleep(100);
					System.out.println("appending");
				} catch (Exception e) {
					System.err.println(e);
				} // end of catch block
			} // for loop end
				// data production is over, so notify to Consumer thread
			sb.notify();
		} // synchronized
	}// run() method end
}// Producer01 class end

class Consumer01 extends Thread {
	// create Producer reference to refer to Producer object from Consumer class
	Producer01 prod;

	Consumer01(Producer01 prod) {
		this.prod = prod;
	}// constructor

	public void run() {
		synchronized (prod.sb) {
			// wait till a notification is received from producer thread.
			// Here there is no wastage of time of even a single milliseconds
			try {
				prod.sb.wait();
			} catch (Exception e) {
				System.err.println(e);
			} // catch block end

			// when data production is over,display data of StringBuffer
			System.out.println(prod.sb);
		} // synchronized
	}// end of run() method
}// Consumer class end