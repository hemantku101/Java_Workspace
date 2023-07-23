//Write a program which shows the use of throws clause
package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Not handle the exception -using throws clause

class Sample{
	//instance variable
	private String name;
	//method to accept name
	void accept() throws IOException {
		//to accept data from keyboard
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		name=br.readLine();//this is throws IOException
	}
	//method to display name
	void display() {
		System.out.println("Name: "+ name);
	}
}
public class Demo7 {
	public static void main(String args[]) throws IOException 
	{
		Sample s= new Sample();
		s.accept();//this is throws IOException
		s.display();
	}
}