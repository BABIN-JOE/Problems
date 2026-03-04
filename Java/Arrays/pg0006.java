//Move zeros to end – Rearrange so all 0s shift to the end while keeping non-zeros in order.

import java.util.*;

public class pg0006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("Array is empty");
            return;
        }
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count < n){
            arr[count++] = 0;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }

        /*
        int count  = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                count += 1;
            }
        }
        int[] res = new int[arr.length];
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                res[j++] = arr[i];
            }
        }
        for(int i = arr.lenggth - count;i<arr.length;i++){
            res[i] = 0;
        }
        for(int i : res){
            System.out.print(i+" ");
        }    
         */
    }
}
