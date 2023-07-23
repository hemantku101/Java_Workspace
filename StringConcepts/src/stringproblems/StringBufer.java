/* Write a program to learn how to use some of the 
StringBuffer class methods.*/

package stringproblems;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufer {
	public static void main(String args[]) throws IOException
	{
		//create empty string buffer object
		StringBuffer sb=new StringBuffer();
		//to accept data from keyboard
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//accept surname
		System.out.println("Enter surname: ");
		String sur=br.readLine();
		//accept middlename
		System.out.println("Enter midname: ");
		String mid=br.readLine();
		//accept lastname
		System.out.println("Enter Lastname: ");
		String last=br.readLine();
		//append sur to sb
		sb.append(sur);
		//append last to sb
		sb.append(last);
		//Dislay the full name till now
		System.out.println("Name= " + sb);
		//insert mid after sur name in sb
		int n=sur.length();
		sb.insert(n, mid);
		System.out.println("Full Name= "+sb);
		//reverse and display the name
		System.out.println("In reverse= "+ sb.reverse());
	}
}
