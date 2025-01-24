package Assign_6;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public static int reverse(int n) {
        int ans = 0;
        int sign = (n > 0) ? 1 : -1;
        n = Math.abs(n);
        while(n > 0) {
            ans = (ans*10) + (n%10);
            n /= 10;
        }
        return sign*ans;
    }
}
