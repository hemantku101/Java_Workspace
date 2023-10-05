package constructors_intro;

/*
 * 1)Constructor name should be same as class name.
	2) If you don't define a constructor for a class, 
    	a default parameterless constructor is automatically
    	created by the compiler. 
	3) The default constructor calls super() and initializes all 
   		instance variables to default value like 0, null.
	4) If we want to call parent class constructor, it must be called in 
		 first line of constructor.
 */
public class Demo {
	int a=10;
	int b;
	//constructor
	Demo(){
		System.out.println("Demo() - Constructor");
	}
	//constructor
		private Demo(int a){
			System.out.println("Demo() - Constructor");
		}
	//constructor
		public Demo(float b){
		System.out.println("Demo() - Constructor");
		}
		//constructor
		protected Demo(String a){
			System.out.println("Demo() - Constructor");
			}	
		//final constructor is not use
//				final Demo(double a){
//					System.out.println("Demo() - Constructor");
//				}
	//method
	//This method has a constructor name
	public void Demo() {
		System.out.println("Demo() - method");
	}
	public static void main(String[] args)
	{
		
	}
	//we can overload main method but can't overwrite
	public static void main(String args) {
		
	}
	protected static void main(String args,String as) {
		
	}
}
