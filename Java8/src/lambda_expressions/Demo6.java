package lambda_expressions;
//Find maximum
@FunctionalInterface
interface Test06
{
	int max(int a,int b);
}
public class Demo6 {
	public static void main(String args[])
	{
		Test06 t=(a,b)->Integer.max(a, b);
		int z=t.max(30,20);
		System.out.println(z);
	}
}
