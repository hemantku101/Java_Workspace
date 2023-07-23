/* Write a program to understand the thread priorities.
 * The thread with higher priority number will complete its execution first */
package program;
	//Thread priorities
class MyClass extends Thread{
	int count = 0;	//this count numbers
	
	public void run() {
		for(int i=0; i<=10000; i++) {
			//System.out.println(count+" forloop");
			count++;}	//count numbers up to 10000
		//Display which Thread has completed counting and its priority
		System.out.println("Completed thread: "+
							Thread.currentThread().getName());
		System.out.println("Its priority: " +
							Thread.currentThread().getPriority());
		System.out.println(count+" count");
	}
}
public class Demo15 {
	public static void main(String args[]) {
		MyClass obj = new MyClass();
		
		//create two threads
		Thread t1 = new Thread(obj, "One");
		Thread t2 = new Thread(obj, "Two");
		
		//set priorities for them
		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY); 	//this means priority no. is 5
		
		//start first t1 and t2.
		t1.start();
		t2.start();
	}
}
