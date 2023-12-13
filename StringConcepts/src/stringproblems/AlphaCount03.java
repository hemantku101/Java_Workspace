package stringproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlphaCount03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
     // Remove spaces and convert to lowercase (optional)
        input = input.replaceAll("\\s+", "").toLowerCase();
        
        Map<Character, Integer> hm = new HashMap<>();

        // Count occurrences of each character
        	char k[]=input.toCharArray();
        for (char ch : k) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        // Display character counts
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " count is " + entry.getValue());
        }
        System.out.println(hm);
    }
}
