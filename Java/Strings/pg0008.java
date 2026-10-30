//Word frequency – Count how many times each word appears in a sentence.

import java.util.*;

class pg0008{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
         String[] words = s.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();        
        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
