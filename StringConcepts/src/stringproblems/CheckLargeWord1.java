package stringproblems;

public class CheckLargeWord1 {
//	    public static void main(String[] args) {
//	        String s = "hello everyone in this";
//
//	        String longestString = "";
//	        for (String word : s.split(" ")) {
//	        	System.out.println(word);
//	            if (word.length() > longestString.length()) {
//	                longestString = word;
//	            }
//	        }
//	        System.out.println("The longest string is: " + longestString);
//	    }

	 public static void findLarge(String str) {
		String[] words = str.split(" ");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
//        for(int i=0;i<words.length;i++) {
//        	System.out.println(words[i]);
//        }
	}
	public static void main(String args[]) {
		String str = "hello everyone in this";
		findLarge(str);
	}	
}