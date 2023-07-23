//Write a program showing execution of multiple tasks with a single thread
package program;
class MyThread3 implements Runnable{
	public void run() {
		//execute the tasks one by one by calling the methods.
		task1();
		task2();
		task3();
	}
	void task1() {
		System.out.println("This is task 1");
	}
	void task2() {
		System.out.println("This is task 2");
	}
	void task3() {
		System.out.println("This is task 3");
	}
}
public class Demo9 {
	public static void main(String args[]) {
		//create an object to MyThread class.
		MyThread3 obj = new MyThread3();
		//create a thread t1 and attach it to that object
		Thread t1=new Thread(obj);
		//execute the thread t1 on that object's run() method
		t1.start();
	}
}
