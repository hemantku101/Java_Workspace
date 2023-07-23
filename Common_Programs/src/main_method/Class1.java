package main_method;

public class Class1 {
	public static void main(String args[]) {
		//args contains names, display them
		for(String s : args) {//using for each loop
			System.out.println(s);
		}
	}
}
//run Class2
class Class2{
	public static void main(String[] args) {
		//take a string type array
		String names[] = {"Gopi","Kumar"};
		
		//call main() method of class1 and pass the names array
		Class1.main(names);
	}
}

