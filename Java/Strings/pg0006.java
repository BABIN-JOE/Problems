//Check anagrams – Determine if two strings have the same letters in any order.

import java.util.*;

public class pg0006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 =s1.replaceAll("\\s","").toLowerCase();
        s2 =s2.replaceAll("\\s","").toLowerCase();
        if(s1.length() != s2.length()){
            System.out.println("Not anagrams");
        }
        else{
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not anagrams");
            }
        }
        /* 
        else{
            int[] arr = new int[26];
            for(int i = 0;i<s1.length();i++){
                arr[s1.charAt(i) - 'a']++;
                arr[s2.charAt(i) - 'a']--;
               }
               for(int i = 0;i<arr.length;i++){
                   if(arr[i] != 0){
                       System.out.println("Not Anagram");
                       return;
                    }
               }
            System.out.println("Anagram");
        }
            */
    }
}
