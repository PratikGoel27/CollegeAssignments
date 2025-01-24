package Assign_6;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        int m = n;
        int count = 0;
        while(n != 0) {
            if((n&1) == 1) {
                count++;
            }
            n >>= 1;
        }
        System.out.println("No. of set bits in the num "+m+" is: "+count);
    }
}
