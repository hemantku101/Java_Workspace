//Write a program to display a message using a thread
package lambda_expressions;
//A simple thread program
public class Demo9 implements Runnable{
	//implement the run() method of the Runnable interface
	public void run() {
		System.out.println("This is from Thread");
	}
	public static void main(String args[]) {
		//create an object to the class
		Demo9 obj = new Demo9();
		
		//attach thread to the object
		Thread t = new Thread(obj);
		
		//run the thread an the object
		t.start();
	}
}