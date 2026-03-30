//Remove duplicates – Eliminate repeated characters, keeping only the first occurrence of each.

import java.util.*;

public abstract class pg0005 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(res.indexOf(ch) == -1){
                res += ch;
            }
        }
        System.out.println(res);
        
        /* 
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : set){
            sb.append(ch);
        }
        System.out.println(sb);
        */
        
    }
}
