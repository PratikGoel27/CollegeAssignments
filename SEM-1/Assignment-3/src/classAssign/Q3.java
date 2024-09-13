package classAssign;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Num: ");
        int a = sc.nextInt();
        System.out.print("Enter the second Num: ");
        int b = sc.nextInt();
        System.out.print("Enter the third Num: ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            if(b > c) {
                System.out.println("Decreasing");
            }else {
                System.out.println("Neither Increasing nor decreasing");
            }
        }else {
            if(c > b) {
                System.out.println("Increasing");
            }else {
                System.out.println("Neither Increasing nor decreasing");
            }
        }
    }
}
