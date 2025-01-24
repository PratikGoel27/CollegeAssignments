package Assign_6;

import java.util.Scanner;

public class Q7 {
    // Function to calculate x^y using bitwise operators
    public static int power(int x, int y) {
        int result = 1;  // Start with the result as 1

        // Loop while y is greater than 0
        while (y > 0) {
            // If y is odd (check least significant bit using bitwise AND)
            if ((y & 1) == 1) {
                result *= x;  // Multiply the result by x
            }

            // Square x and halve y (right shift y by 1)
            x = x * x;
            y >>= 1;  // Right shift y by 1 (equivalent to dividing by 2)
        }

        return result;  // Return the result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int y = sc.nextInt();
        System.out.println(x + "^" + y + " = " + power(x, y));
    }
}
