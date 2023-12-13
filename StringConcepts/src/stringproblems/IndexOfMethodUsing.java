package stringproblems;

/*
 * There are four variants of the indexOf() method
 * int indexOf()
 * int indexOf(char ch, int strt)
 * int indexOf(String str)
 * int indexOf(String str, int strt)
 *
 */

public class IndexOfMethodUsing {
	
	//int indexOf()
	public static void firstIn(String str) {
		System.out.print("Found g first at position : ");
		// Initial index of 'g' will print
		// prints 11
		System.out.println(str.indexOf('g'));
	}
	//int indexOf(char ch, int strt)
	public static void SecondIn(String str) {
		System.out.print("Found g after 13th index at position : ");
	 
	        // 2nd index of 'g' will print
	        // prints 19
	        System.out.println(str.indexOf('g', 13));
	}
	
	//int indexOf(String str)
	public static void ThirdIn(String str) {
		 // Initialising search string
        String subst = new String("geeks");
 
        // print the index of initial character
        // of Substring
        // prints 11
        System.out.print(
            "Found geeks starting at position : ");
        System.out.println(str.indexOf(subst));
	}
	
	public static void ForthIn(String str) {
		// Initialising search string
        String subst = new String("geeks");
 
        // print the index of initial character
        // of Substring after 14th position
        // prints 19
        System.out.print("Found geeks(after 14th index) starting at position : ");
        System.out.print(str.indexOf(subst, 14));
	}
	
		public static void main(String args[])
		{

			// Initialising String
			String gfg = new String("Welcome to geeksforgeeks");
			
			firstIn(gfg);
			SecondIn(gfg);
			ThirdIn(gfg);
			ForthIn(gfg);
		}
}
