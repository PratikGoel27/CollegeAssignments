package classAssign;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        while(a) {
            int cg = (int)Math.random()*10+1;
            System.out.println("User guess: ");
            int ug = sc.nextInt();
            if(ug == cg) {
                System.out.println("Computer guess: "+cg);
                System.out.println("User guess: "+ug);
                System.out.print("Good guess");
                a = false;
            }else if(ug > cg) {
                System.out.println("Computer guess: "+cg);
                System.out.println("User guess: "+ug);
                System.out.print("Too high, try again");
            }else {
                System.out.println("Computer guess: "+cg);
                System.out.println("User guess: "+ug);
                System.out.print("Too low, try again");
            }
        }
    }
}
