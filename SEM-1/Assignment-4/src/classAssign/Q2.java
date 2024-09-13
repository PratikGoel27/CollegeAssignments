package classAssign;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int n = sc.nextInt();
        int N = n;
        int sum = 0;
        while (n > 0) {
            int c = n % 10;
            sum += c;
            n /= 10;
        }
        if (sum % 9 == 0) {
            System.out.println();
        }
        System.out.println("The Num " + N + " is divisible by 9");
    }
}

