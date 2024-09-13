package classAssign;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. for which you want to find the multiplication table: ");
        int N = sc.nextInt();
        System.out.println("The multiplication table of "+N+" is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N+"X"+i+"="+N*i);
        }
    }
}
