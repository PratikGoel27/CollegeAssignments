package classAssign;
import java.util.*;
public class Q6 {
    public static boolean isOdd(int n) {
        if((n & 1) == 0) {
            return false;
        }else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int n = sc.nextInt();
        System.out.println(n+" is odd: "+isOdd(5));
    }
}
