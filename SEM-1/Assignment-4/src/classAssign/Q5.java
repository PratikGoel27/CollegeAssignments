package classAssign;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int N = sc.nextInt();
        int sum =0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        if(N == sum) {
            System.out.println(N+" is a perfect number.");
        }else {
            System.out.println(N+" is not a perfect number.");
        }
    }
}
