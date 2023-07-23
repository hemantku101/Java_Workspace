package lambda_expressions;
//program to Reverse a String
@FunctionalInterface
interface Test08 {
    String reverse(String n);
}

public class ReverseString {
	public static void main( String[] args ) {
        Test08 ref = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
            result += str.charAt(i);
            return result;
        };
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }
}

