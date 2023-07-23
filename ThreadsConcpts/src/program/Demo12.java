//program to demonstrate Synchronization, wait(), notify() methods:
package program;
class Bank{
	float balance = 5000.00f;
	synchronized void withdraw (float amount) {
		try {
			System.out.println("Withdraw started ---------");
			if(balance < amount) {
				System.out.println("Less balance, waiting for diposit");
				wait();
			}//if end
			balance = balance - amount;
			System.out.println("Withdraw completed -----------");
		}catch(Exception e) {
			System.err.println(e);
		}//catch end
	}//synchronized end
	synchronized void deposit(float amount) {
		System.out.println("Deposit started -----------");
		balance = balance + amount;
		System.out.println("Deposit completed ----------");
		notify();
	}//synchronized end
}//Bank class end

class Customer1 extends Thread{
	Bank b;
	Customer1(Bank b){
		this.b=b;
	}//constructor
	public void run() {
		b.withdraw(6000.00f);
	}//run method end
}//Customer1 class end

class Customer2 extends Thread{
	Bank b;
	Customer2(Bank b){
		this.b=b;
	}//constructor
	public void run() {
		b.deposit(5000.00f);
	}//end run() method
}//end of Customer2 class

public class Demo12 {
	public static void main(String args[]) {
		Bank b = new Bank();
		Customer1 c1 = new Customer1(b);
		c1.start();
		Customer2 c2 = new Customer2(b);
		c2.start();
	}//main method end
}//main class end