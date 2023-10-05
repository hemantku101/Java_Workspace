package constructors_intro;

public class CheckObjectCreation {
	public static int sum(int a, int b){
		//print
        System.out.print(a+""+b);
        //sum of a and b is return to method
        return a+b;
    }
    
    public static void main(String[] args) {
       // System.out.println(sum(sum(1,2),3));	
        //System.out.println(sum(3, sum(1,2)));
        //System.out.println(sum(1,2));
        System.out.println(sum(1,sum(0,1)));
    }
}