package program;
//program to get current thread information:
public class ThreadInformation {
	public static void main (String[] args) {
		Thread t= Thread.currentThread();
		System.out.println("Current thread name: "+t.getName());
		System.out.println("current priority: "+t.getPriority());
		t.setName("Sample");
		t.setPriority(Thread.MAX_PRIORITY);//max is 10
		System.out.println(t.getName());
		System.out.println(t.getPriority());
	}
}
