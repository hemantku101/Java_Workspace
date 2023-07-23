package lambda_expressions;

//program to find cube
interface Test05
{
	int cube(int a);
}
public class Demo5 {
	public static void main(String[] args) {
		Test05 t=a->a*a*a;
		int y=t.cube(2);
		System.out.println(y);
	}
}
