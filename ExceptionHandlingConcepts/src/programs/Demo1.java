package programs;

public class Demo1 {
	public static void main(String args[])
	{
		try {
			int x=Integer.parseInt(args[0]);
			
			int y=Integer.parseInt(args[1]);
			System.out.println(x/y);
			
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Please pass two agruments");
		}
		//when we enter string
		catch(Exception e)
		{
			e.printStackTrace();
			e.toString();
			System.out.println(e.toString());
			
			System.err.println("Please pass two number only");
		}
		// when we enter zero in "y" position
		
	}
}
