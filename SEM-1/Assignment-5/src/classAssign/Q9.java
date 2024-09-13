package classAssign;
import java.util.Scanner;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        double sum = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += 1/Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
