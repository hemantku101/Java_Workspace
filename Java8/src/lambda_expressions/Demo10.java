//Write a thread program to display a message, where a separate implementation class for Runnable interface is created

package lambda_expressions;
//A simple thread program
//in this version we are separately creating implementation class of Runnable Interface
public class Demo10 {
	public static void main(String args[]) {
		//create thread object and pass the object of
		//implementation class of Runnable interface
		Thread t = new Thread(new Implclass());
		//run the thread
		t.start();
	}
}
//This is the implementation class for Runnable interface
class Implclass implements Runnable{
	//implement the run() method of the Runnable interface
	public void run() {
		System.out.println("This is from implementation class");
	}
}
