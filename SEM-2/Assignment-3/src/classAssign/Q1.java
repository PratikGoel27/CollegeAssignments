package classAssign;

import java.util.Scanner;

public class Q1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your lucky num: ");
//        int a = sc.nextInt();
//           try {
//               if (a < 0) {
//                   throw new NumberFormatException("Negative number not allowed!!");
//               }
//               System.out.println("Your lucky Num is: " + a);
//           }catch(Exception e) {
//               System.out.println("You have entered an negative integer which is not allowed");
//           }
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your lucky number: ");
    int num = sc.nextInt();
    try {
        if (num < 0) {
            throw new NumberFormatException("Negative number not allowed!!");
        }
        System.out.println("Your lucky number is " + num);
    } catch (NumberFormatException e) {
        System.out.println(e.getMessage());
    }
}
}

