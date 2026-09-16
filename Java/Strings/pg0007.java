//Longest substring without repeating – Find the maximum-length substring that has all unique characters.

import java.util.*;

public class pg0007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxLength = 0;
        String longestSubstr = "";
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            StringBuilder currentSubstr = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (set.contains(ch)) {
                    break;
                }
                set.add(ch);
                currentSubstr.append(ch);
            }
            if (currentSubstr.length() > maxLength) {
                maxLength = currentSubstr.length();
                longestSubstr = currentSubstr.toString();
            }
        }
        System.out.println(longestSubstr);
    }
}
