//Palindrome check – Verify if a string reads the same forward and backward.

import java.util.*;

public class pg0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String rev = "";
        for(int i = s1.length() - 1;i>=0;i--){
            rev += s1.charAt(i);
        }
        if(s2.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
