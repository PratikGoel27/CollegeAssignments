package Assign_6;

import java.util.Scanner;

public class Q4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the num: ");
//        long n = sc.nextLong();
//        long ans = n ^ -1;
//        System.out.println("Num with all it's bits reversed: "+ans);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        long n = sc.nextLong();
        long ans = n ^ -1;
        System.out.println(ans);
    }
}
