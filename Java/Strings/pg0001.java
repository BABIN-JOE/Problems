// Reverse a string – Rearrange characters in a string from last to first without built-in reverse.

import java.util.Scanner;

class pg0001{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }
}
