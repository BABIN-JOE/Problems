//Largest & smallest elements – Identify the maximum and minimum values in an array.

import java.util.*;

class pg0001 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Array is empty");
            return;
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        /*
        Arrays.sort(arr);
        int max = arr[n-1];
        int min = arr[0];
         */
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
