package stringproblems;
import java.util.Scanner;
public class A2B3C4 {
	
	public  static void printdouble(String str)
	{
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			int j=(int)str.charAt(i+1)-48;
			char c=str.charAt(i);
			if(j>=0 && j<=9)
			{
			int k=0;
			while(k<j)
			{
				System.out.print(c);
				k++;
			}
			i++;
			}
			else
				System.out.print(str.charAt(i));
		}	
	}
	public static void main(String args[])
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String str=sc.nextLine();
		printdouble(str);
		sc.close();
	}
}