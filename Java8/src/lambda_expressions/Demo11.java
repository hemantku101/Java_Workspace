//Write a thread program to display a message by using anonymous inner class
package lambda_expressions;
//a simple thread program
//we are using anonymous inner class
public class Demo11 {
	public static void main(String args[]) {
		//create thread object and pass the object of anonymous class
		Thread t = new Thread(new Runnable()
		{
			//implement the run() of the Runnable interface
			public void run()
			{
				System.out.println("This is from anonymous inner class");
			}
		});
		//run the thread
		t.start();
	}
}