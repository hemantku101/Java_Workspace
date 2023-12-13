package get_start_programs;

import java.util.Scanner;

public class FindPaliandromePrimeNumberUpTo100 {
	
	public static boolean checkPalPrime(int num) {
		
		int temp,rem;
		int sum=0;
		temp=num;
		int count=0;
		for(int i=1;i<=temp;i++) {
		   if(temp%i==0) {
			count++;
		   }
		}
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum && count==2) 
			return true;
		else 
			return false;	
		}
	public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a number  to find out PalindromePrime Number from your first entered number:");
	        int startValue=sc.nextInt();
	    System.out.println("Enetr a number  to find out PalindromePrime Number from your second entered number:");
	    int endValue=sc.nextInt();
	    System.out.println("Paliandrome prime 100 numbers are:: ");
	    //int count=0;
	    for(int i=startValue;i<=endValue;i++) {
	    	//System.out.println("i"+i);
	  	      if(checkPalPrime(i)) {
	  	    	  System.out.print(i+" , ");
	  	    	  //System.out.println("hiiiiii");
	  	    	/*  count++;
	  	    	  if(count==100) {
	  	    		  return  ;
	  	    		  }
	  	      */
	  	    	
	  	      }
	    }
	
	}
	}