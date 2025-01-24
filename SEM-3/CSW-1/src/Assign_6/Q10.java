package Assign_6;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        float a = sc.nextFloat();
        System.out.print("Enter the second num: ");
        float b = sc.nextFloat();
        if(check(a,b))
            System.out.println("Diff is less than epsilon");
        else
            System.out.println("Diff is greater than epsilon");
    }

    public static boolean check(float a, float b) {
        float diff = Math.abs(a-b);
        float epsilon = 0000.1f;
        return diff < epsilon;
    }
}
