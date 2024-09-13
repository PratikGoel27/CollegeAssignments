package classAssign;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first No.: ");
        int m = sc.nextInt();
        System.out.print("Enter the second No.: ");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            int product = 1;
            for (int j = 1; j <= i; j++) {
                product *= j;
            }
            System.out.println("Factorial of "+i+" is: "+product);
        }
    }
}
