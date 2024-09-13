package classAssign;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int N = sc.nextInt();
        int sum = 0;
        System.out.print("Random numbers generated are: ");
        for (int i = 1; i <= N; i++) {
            int a = (int)Math.random()*N+1;
            System.out.print(a+" ");
            sum += a;
        }
        System.out.println();
        System.out.println("Average of 6 random numbers are: "+sum/N);
    }
}
