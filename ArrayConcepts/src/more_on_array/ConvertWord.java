package more_on_array;

import java.util.Scanner;

public class ConvertWord {
	public static void conWord(int num) {
		int n1=num;
		int n2=num;
		int b=n1%10;int a=n2/10;
		String sing[]=new String[] {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String two[]= new String[] {"","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String tens[]=new String[] {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		if(a==1)
			System.out.println(two[b+1]);
		else if(b==0)
			System.out.println(tens[a]);
		else
			System.out.println(tens[a]+" "+sing[b]);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n= sc.nextInt();
		conWord(n);
		sc.close();
	}
}
