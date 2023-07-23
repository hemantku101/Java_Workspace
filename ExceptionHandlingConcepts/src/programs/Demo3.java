package programs;
//Program to create and handle checked exception:-

import java.util.Scanner;
@SuppressWarnings("serial")
class NegativeNumberException extends Exception
{

}
public class Demo3 {
	void cube(int a) throws NegativeNumberException
	{
		if(a>0)
			System.out.println(a*a*a);
		else
			throw new NegativeNumberException();
	}
	public static void main(String args[])
//throws NegativeNumberException(dont write try and catch block)
	{
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int x=sc.nextInt();
			Demo3 d=new Demo3();
			d.cube(x);
			sc.close();
		}catch(NegativeNumberException ne)
		{
			System.err.println(ne);
		}
	}
}