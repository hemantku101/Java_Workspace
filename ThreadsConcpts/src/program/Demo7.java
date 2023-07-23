//write a program to create MyThread class with run() method and 
//then attach a thread to this My Thread Class
package program;

//to create a thread and run it
//let the class extends Thread or implements Runnable
class MyThread extends Thread{
	//write run() method inside this class
	public void run() {
		//only this code is executed by the thread
		for(int i=1;i<=10000;i++) {
			System.out.println(i);
		}
	}
}
//another class
public class Demo7 {
	public static void main(String args[]) {
		//create an object to MyThread class
		MyThread obj=new MyThread();
		
		//create a thread and attach it to the object of MyThread class.
		Thread t=new Thread(obj);
		
		//now run the thread on the object
		t.start();
		//now this thread will execute the code inside run() method of MyThread of MyThread object
	}
}
