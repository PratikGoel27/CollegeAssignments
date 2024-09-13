package homeAssign;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int N = sc.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= N; i++) {
            if(i % 2 == 0) {
                sum += i;
            }else {
                product *= i;
            }
        }
        System.out.println("Sum of all even Num: "+sum);
        System.out.println("Product of all odd Num: "+product);

    }
}
