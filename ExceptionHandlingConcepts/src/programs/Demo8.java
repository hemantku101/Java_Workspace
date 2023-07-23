//Write a program that shows he use of throw clause for for throwing the NullPointerException
package programs;

class Sample01{
	static void demo() {
		try {
		System.out.println("Inside demo()");
		throw new NullPointerException("Exception data");//throw will throw the exception
	}catch(NullPointerException ne) {
		System.err.println(ne);
	}
	}
}
public class Demo8 {
	public static void main(String args[]) {
		Sample01.demo();
	}
}
