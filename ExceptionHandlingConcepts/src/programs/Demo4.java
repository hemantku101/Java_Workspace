package programs;
//program to create unchecked exception
import java.util.Scanner;
@SuppressWarnings("serial")
class NegativeNumberException01 extends RuntimeException
{
	
}
public class Demo4 {
	void cube(int a) throws NegativeNumberException01
	{
		if(a>0)
			System.out.println(a*a*a);
		else
			throw new NegativeNumberException01(); 
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int x=sc.nextInt();
		Demo4 d=new Demo4();
		d.cube(x);
		sc.close();
	}
}
