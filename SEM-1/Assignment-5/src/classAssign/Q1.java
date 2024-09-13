package classAssign;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first No.: ");
        int a = sc.nextInt();
        System.out.print("Enter the second No.: ");
        int b = sc.nextInt();
//        PROPER DIVISERS OF A:-
        int sumOfa = 0;
        int sumOfb = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sumOfa += i;
            }
        }
        for (int i = 1; i < b; i++) {
            if(b % i == 0) {
                sumOfb += i;
            }
        }
        if(a == sumOfb && b == sumOfa) {
            System.out.println(a+" "+b+" Amicable Numbers");
        }
    }
}
