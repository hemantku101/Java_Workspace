//Write a program to throw a user defined exception
package programs;
//User defined exception
//to thrown whenever balance amount is below Rs. 1000


@SuppressWarnings("serial")
public class Demo9 extends Exception{
	//Store account information
	private static int accno[]= {1001,1002,1003,1004,1005};
	
	private static String name[]= {"Raja Rao", "Rama Rao", "Subba Rao", "Appa Rao", "Laxmi Devi"};
	
	private static double bal[]= {10000.00, 12000.00,5600.50,999.00,1100.55};
	
	//default constructor
	Demo9(){
		
	}
	
	//Parameterized constructor
	Demo9(String str){
		super(str);
	}
	//Write main()
	public static void main(String args[]) {
		try {
			//Display the heading for the table
			System.out.println("ACCNO"+"\t"+"CUSTOMER"+"\t"+"BALANCE");
			
			//Display actual account information
			for(int i=0;i<5;i++) {
				System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
				
				//Display own Exception if balance < 1000
				if(bal[i]<1000) {
					Demo9 d=new Demo9("Balance amount is Less");
					throw d;
				}//if end
			}//end of try
		}catch(Demo9 me) {
			me.printStackTrace();
		}
	}
}
