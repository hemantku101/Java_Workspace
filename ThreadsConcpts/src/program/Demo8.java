/*write program to showing how to terminate the thread by pressing 
the thread by pressing the Enter button */

package program;
import java.io.*;
//to create a thread and run it, then stop it
class MyThread01 extends Thread{
	boolean stop=false;
	//write run() method inside this class
	public void run() {
		//only this code is executed by the thread
		for(int i=1;i<=10000;i++) {
			System.out.println(i);
			if(stop) return; //come out of run()
		}
	}
}
public class Demo8 {
	public static void main(String args[]) throws IOException{
		//create an object to MyThread class
		MyThread01 obj=new MyThread01();
		
		//create a thread and attach it to the object of MyThread class.
		Thread t=new Thread(obj);
		
		//now run the thread on the object
		t.start();
		//now this thread will execute the code inside run() method of MyThread of MyThread object
		
		//stop the thread when Enter key is pressed
		System.in.read();
		obj.stop=true;
	}
}