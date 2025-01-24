package Assign_6;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0) {
            if(((n%10)%2) == 0)
                count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
