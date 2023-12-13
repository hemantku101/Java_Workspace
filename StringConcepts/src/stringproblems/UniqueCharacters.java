package stringproblems;

import java.util.Scanner;

public class UniqueCharacters {
	
	 public static void printUniqueCharacters(String str) {
	        // Use a boolean array to mark characters encountered
	        boolean[] visited = new boolean[256]; // Assuming ASCII characters
	        
	        // Iterate through the string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            // If the character is encountered for the first time
	            if (!visited[ch]) {
	                visited[ch] = true;
	                System.out.print(ch + " ");
	            }
	        }
	    }
	
	public static void printUniqe(String str){
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the current character is the first occurrence in the string
            //hello
            //01234
            if (str.indexOf(ch) == i) {
                System.out.print(ch + " ");
            }
        }
	}
    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a String");
    	
        String inputString = sc.nextLine();
        printUniqe(inputString);
        
        // Assuming case sensitivity (i.e., considering 'H' and 'h' as different characters)
       // printUniqueCharacters(inputString);
    }
    
   
}

/*visited[ch]: The visited array is a boolean array that keeps track of whether a character has been encountered before. 
 * Each index of the array corresponds to a character's ASCII value. Initially, all elements in this array are false.

!visited[ch]: This condition checks whether the character at index ch in the visited array is false. This means that the
 character hasn't been encountered before during the iteration through the string.

visited[ch] = true;: If the condition !visited[ch] is true, it means the character is encountered for the 
first time in the string. The code sets visited[ch] to true, marking that this character has been encountered.

System.out.print(ch + " ");: This line prints the character ch followed by a space. It prints the character as it's 
a unique character encountered for the first time during the iteration.

So, the if statement with !visited[ch] ensures that only characters encountered for the first time are considered 
as unique and are printed to the console. If a character has been encountered previously, it won't be considered as 
unique and won't be printed again.
 * 
 */
