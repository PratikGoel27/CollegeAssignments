package Assign_6;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int m = sc.nextInt();
        CountFreqOfDigits(m);
    }

    public static void CountFreqOfDigits(int n) {
        n = Math.abs(n);
        int []arr = new int[10];
        while(n > 0) {
            arr[n%10]++;
            n /= 10;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                System.out.println("freq of "+i+" is:"+arr[i]);
            }
        }
    }
}
