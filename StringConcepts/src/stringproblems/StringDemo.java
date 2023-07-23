//write a program  which will help us to understand how o create strings and 
//how to create strings and how to use some important methods of String class.

package stringproblems;

public class StringDemo {
	public static void main(String args[])
	{
		//create strings in 3 ways
		String s1="A book on Java";
		String s2=new String("I Like it");
		char arr[]= {'D','r','e','a','m','t','e','c','h',' ','P','r','e','s','s'};
		String s3=new String(arr);
		
		//Display all the 3 strings
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//find length of first String
		System.out.println("Length of s1= "+s1.length());
		
		//concatenate two String
		System.out.println("s1 and s2 joined= "+ s1.concat(s2));
		
		//concatenate three Strings with +
		System.out.println(s1+" from "+s3);
		
		//test if String s1 starts with A
		boolean x=s1.startsWith("A");
		if(x)
			System.out.println("s1 starts with \'A\'");
		else
			System.out.println("s1 does not start with \'A\'");
		
		//extract substring from s2, starting from 0th char to 6th char
		String p=s2.substring(0,7);
		
		//extract substring from s3, starting from 0th char to 8th char
		String q=s3.substring(0,9);
		
		//concatenate the strings p and q.
		System.out.println(p+q);
		
		//convert s1 into uppercase and lowercase
		System.out.println("Upper s1= "+s1.toUpperCase());
		System.out.println("Lower s1= "+s1.toLowerCase());
		
		//String s1="A book on Java";
		//Coping  a string into an array
		char arra[]=new char[10];
		
		//copy from s1 into arra starting from 
		s1.getChars(2, 9, arra, 1);
		System.out.println(arra);
		
		//declare a string type array s to store pieces
		String s[];
		
		//split the string where a space is found in s1
		s=s1.split(" ");
		
		//Display the pieces from s
		for(int i=0;i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
		
	}
	
}
