package classAssign;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first No.: ");
        int a = sc.nextInt();
        System.out.print("Enter the second No.: ");
        int b = sc.nextInt();
        for (int i = a+1; i < b; i++) {
            boolean c = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if(i % j == 0) {
                    c = false;
                }
            }
            if(c) {
                System.out.print(i+" ");
            }
        }
    }
}
