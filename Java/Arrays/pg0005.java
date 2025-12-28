//Find duplicate number – Detect if any element appears more than once in the array.

import java.util.*;

public class pg0005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Array is empty");
            return;
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                duplicates.add(i);
            } else {
                set.add(i); 
            }
        }        
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicates found: " + duplicates);
        }
    }
}
