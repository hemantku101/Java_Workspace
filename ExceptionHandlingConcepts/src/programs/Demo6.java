package programs;

public class Demo6 {
	public static void main(String args[]) {
		try {
			//open the file
			System.out.println("open file");
			
			//do some processing
			int n= args.length;
			System.out.println("n= "+ n);
			int a=45/n;
			System.out.println("a= "+ a);
			int b[]= {10,20,30};
			b[50]=100;
			//b[2]=100; //no exception
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			//Display the exception details
			System.err.println(ae);
		}
		finally {
			//close the file
			System.out.println("close file");
		}
	}
}