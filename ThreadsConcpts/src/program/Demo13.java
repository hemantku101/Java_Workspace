//write a program where the Consumer thread checks whether 
//the data production is over or not every 10 milliseconds

/* This program show how two threads can communicate with each other.
     This is inefficient way of communication */
package program;

//main class
public class Demo13 {
	public static void main(String args[]) throws Exception {
		// Producer produces some data which consumer consumes
		Producer obj1 = new Producer();
		// Pass Producer object to Consumer so that it is then available to consumer
		Consumer obj2 = new Consumer(obj1);
		// create 2 Threads and attach to Producer and Consumer
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		// Run the threads
		t2.start(); // Consumer waits
		t1.start(); // Producer start Production
	}// end of main method
}// Demo13 class end

class Producer extends Thread {
	// to add data, we use StringBuffer object
	StringBuffer sb;

	// dataprodover will be true when data production is over
	boolean dataprodover = false;

	Producer() {
		sb = new StringBuffer(); // allot memory
	}

	public void run() {
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
			// data production is over, so store true into dataprodover
		dataprodover = true;
	}// run() method end
}// Producer class end

class Consumer extends Thread {
	// create Producer reference to refer to Producer object from Consumer class
	Producer prod;

	Consumer(Producer prod) {
		this.prod = prod;
	}// constructor

	public void run() {
		// if data production is not over, sleep for 10 milliseconds and again check
		// again.
		// Here there is a time delay of several milliseconds to receive data
		try {
			while (!prod.dataprodover)
				Thread.sleep(10);
		} catch (Exception e) {
			System.err.println(e);
		} // catch block end
			// when data production is over,display data of StringBuffer
		System.out.println(prod.sb);
	}// end of run() method
}// Consumer class end