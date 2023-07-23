package programs;
//Write a program which tells the use of try, catch and finally block
public class Demo5 {
	public static void main(String args[]) {
		try {
			//open the file
			System.out.println("open file");
			
			//do some processing
			int n= args.length;
			System.out.println("n= "+ n);
			int a=45/n;
			System.out.println("a= "+ a);
		}catch(ArithmeticException ae) {
			//Display the exception details
			System.err.println(ae);
			
			//display ant message to the user
			System.out.println("Please pass data while running this program");
		}
		finally {
			//close the file
			System.out.println("Close file");
		}
	}
}
