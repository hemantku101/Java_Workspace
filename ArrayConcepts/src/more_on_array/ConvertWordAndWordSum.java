package more_on_array;

import java.util.Scanner;

public class ConvertWordAndWordSum {
	//To convert numbers to word
	public static String conWord(int num) {
		int n1=num,n2=num;
		int b=n1%10;
		int a=n2/10;
		String word="";
		String sing[]=new String[] {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String two[]= new String[] {"","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String tens[]=new String[] {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		if(a==1) {
			//System.out.println(two[b+1]);
			word=two[b+1];
		}
		else if(b==0) {
			//System.out.println(tens[a]);
			word=tens[a];
		}
		else {
			if(tens[a].length()>1)
			{
			//System.out.println(tens[a]+" "+sing[b]);
			word=tens[a]+" "+sing[b];
			}
			else
				word=sing[b];
		}
		return word;
	}
	//To check words length
	public static int wordLen(String str) {
		//int len=0;
		//System.out.println(str);
		System.out.print(str.length());
		return str.length();
	}
	//To perform sum operations of words
	public static void wordSum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=wordLen(conWord(arr[i]));
			if(i==arr.length-1) {
				System.out.print("=");
				System.out.print(sum);
			}
			else
				System.out.print("+");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first Number to perform Sum operation");
		//int n= sc.nextInt();
		int f=sc.nextInt();
		System.out.println("Enter a Second Number to perform Sum operation");
		int l=sc.nextInt();
		int x=l-f+1;
		int arr[]=new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=f;
			f++;
		}
		wordSum(arr);
		//wordLen(conWord(n));
		//conWord(n);
		//System.out.println(conWord(n));
		sc.close();
	}
}
