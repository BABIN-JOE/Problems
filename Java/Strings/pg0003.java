//Count vowels & consonants – Count how many vowels (a, e, i, o, u) and consonants exist in a string.

import java.util.*;

public class pg0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s","").toLowerCase();
        int c1 = 0;
        int c2 = 0;
        Set<Character>vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(vowels.contains(ch)){
                    c1++;
                }
                else{
                    c2++;
                }
            }
    
        }
        System.out.println("Vowels: " + c1);
        System.out.println("Consonants: " + c2);
    }
}
