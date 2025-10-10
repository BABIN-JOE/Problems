//Find missing number – In a sequence from 1 to n, detect which number is absent.

import java.util.*;

class pg0004{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Array is empty");
            return;
        }
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int total = (n+1)*(n+2)/2;
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        System.out.println("Missing number is: "+(total-sum));
    }
}
