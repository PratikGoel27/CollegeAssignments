package classAssign;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int c = n % 10;
            sum += c;
            product*=c;
            n/=10;
        }
        if(sum == product) {
            System.out.println("Spy Num");
        }else {
            System.out.println("Not a Spy Num");
        }
    }
}
