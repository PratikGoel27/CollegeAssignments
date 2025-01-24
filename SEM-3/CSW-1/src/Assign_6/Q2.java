package Assign_6;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        int count = 0;
        while(n != 0) {
            if((n&1) == 1) {
                count++;
            }
            n >>= 1;
        }
        if((count%2) == 0)
            System.out.println("Pairity of num is 0");
        else
            System.out.println("Pairity of num is 1");
    }
}
