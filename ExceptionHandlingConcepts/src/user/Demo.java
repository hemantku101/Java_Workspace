package user;

import java.util.Scanner;

@SuppressWarnings("serial")
class NegativeNumberException extends Exception{
	
}
public class Demo {
	void cube(int a)throws NegativeNumberException
	{
		if(a>0)
			System.out.println(a*a*a);
		else
			throw new NegativeNumberException();
	}
	public static void main(String ...args) {
		try {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		Demo d= new Demo();
		d.cube(num);
		sc.close();
	}catch(NegativeNumberException nne) {
		System.err.println(nne);
	}
}
}
