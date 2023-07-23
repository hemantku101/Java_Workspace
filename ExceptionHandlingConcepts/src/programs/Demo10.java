package programs;
//Write a program to throw the StringIndexOutOfBoundsException
class A{
	void method1() {
		try {
			//take a string with 5 chars.  There index will be from 0 to 4.
			String str="Hello";
			
			//exception is thrown in below statement because there is no index with value 5.
			@SuppressWarnings("unused")
			char ch =str.charAt(5);
		}catch(StringIndexOutOfBoundsException sie) {
			System.out.println("Please see the index is within the range");
			throw sie;
		}
	}
}
//main class
public class Demo10 {
	public static void main(String args[]) {
		//create an object to A and call method1()
		A a=new A();
		try {
			a.method1();
		}//the rethrown exception is caught by the below catch block
		catch(StringIndexOutOfBoundsException sie) {
			System.out.println("I caught rethrown exception");
		}
	}
}
