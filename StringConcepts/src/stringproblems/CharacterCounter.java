package stringproblems;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        String inputString = "Hhllo, world!";
        
        // Remove spaces and convert to lowercase (optional)
        inputString = inputString.replaceAll("\\s+", "").toLowerCase();
        //inputString = inputString.toLowerCase();
        
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Count occurrences of each character
        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        
        // Display character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue() + " times");
        }
    }
}
