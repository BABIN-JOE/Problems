//First non-repeating character – Find the first character that appears only once in the string.

import java.util.*;

public class pg0004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetter(ch)) continue;
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        boolean found = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}
