package classAssign;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= power; i++) {
            product *= base;
        }
        System.out.println(base+" to the power "+power+" is: "+product);
    }
}
