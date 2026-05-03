//Reverse array – Rearrange elements so the first becomes last and vice versa, without extra space.

import java.util.*;

class pg0002{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Array is empty");
            return;
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int start = 0, end = n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
