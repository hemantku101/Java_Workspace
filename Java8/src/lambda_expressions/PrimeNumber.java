package lambda_expressions;
//Find prime number

@FunctionalInterface
interface Test07
{
	void isPrime(int a);
}
public class PrimeNumber {
	static int count;
	public static void main(String args[]) {
		
		Test07 t=a->{
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
					count++;
			}
			if(count==2)
			System.out.println(a+" is a prime number");
			else
				System.out.println(a+" is not a prime number");
		    };
		    t.isPrime(13);
	}
}
