package programs;

public class Demo2 {
	public static void main(String args[])
	{
		try {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		System.out.println(x/y);
		}catch(RuntimeException re)
		{
			System.err.println("Please pass two numbers and second number except zero");
		}
	}
}
//RuntimeException re= new ArrayIndexOutofBoundsExcepion(upcasting)