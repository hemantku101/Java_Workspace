package intro;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Map<String, String> replacements = new HashMap<>();
        replacements.put("ab", "c");
        replacements.put("ac", "b");
        replacements.put("bc", "a");
        replacements.put("ba", "c");
        replacements.put("ca", "b");
        replacements.put("cb", "a");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = stringReduction(input, replacements);
        System.out.println(result);
        scanner.close();
    }

    public static int stringReduction(String input, Map<String, String> replacements) {
        String original;
        do {
            original = input;
            for (Map.Entry<String, String> entry : replacements.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                input = input.replace(key, value);
            }
        } while (!input.equals(original));
        

        return input.length();
      
    }
}
