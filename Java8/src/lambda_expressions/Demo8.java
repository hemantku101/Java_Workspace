//Write a program to calculate area by passing a lambda expression to a method
package lambda_expressions;
//Passing lambda expression as an argument to a method
//we are going to calculate area of a circle
public class Demo8 {
	//create a FunctionalInterface with one abstract method
	@FunctionalInterface
	interface Circle{
		void calculate(double radious);
	}
	//a method with FunctionalInterface reference ref as its arguments
	void circleArea(double radious,Circle ref) {
		ref.calculate(radious); 	//this will execute the lambda expression
	}
	
	public static void main(String args[]) {
		//create object to the class
		Demo8 obj = new Demo8();
		
		//let the FunctioalInterface reference refer to the lambda expression 
		//this lambda expression implements calculate(radius) method
		Circle ref = (r) -> {System.out.println("Area= "+ Math.PI * r * r);};
		
		//call the method, pass radius and lambda expression as arguments
		obj.circleArea(20, ref);
	}
}