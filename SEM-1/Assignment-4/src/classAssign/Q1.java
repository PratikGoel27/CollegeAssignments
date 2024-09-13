package classAssign;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        for (int i = a; i <= b; i = i+c) {
            System.out.print(i+" ");
        }
    }
}
