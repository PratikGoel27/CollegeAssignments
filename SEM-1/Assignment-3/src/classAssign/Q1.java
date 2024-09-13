package classAssign;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        if(age > 18) {
            System.out.println("You are eligible to cast your vote");
        }else {
            System.out.println("You are not eligible to cast your vote");
        }
    }
}
