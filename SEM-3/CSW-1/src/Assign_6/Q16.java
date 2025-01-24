package Assign_6;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if((i%j)==0) {
                    break;
                }
            }

        }
    }
}
