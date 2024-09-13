package classAssign;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

    }
}

class Complex {
    int real;
    int imag;
    void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part: ");
        real = sc.nextInt();
        System.out.print("Enter the imag part: ");
        imag = sc.nextInt();
    }
    void displayData() {
        System.out.println("The real part is: "+real);
        System.out.println("The imag part is: "+imag);
    }
}
