package lambda_expressions;
//convert lower case to upper case

interface Test04 {
	String upper(String s);
}

public class Demo4 {
	public static void main(String args[]) {
		Test04 t = s -> s.toUpperCase();
		String s1 = t.upper("welcome");
		System.out.println(s1);
	}
}
