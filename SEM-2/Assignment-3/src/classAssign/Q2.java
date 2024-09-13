package classAssign;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];
        System.out.println("Enter your fav colors: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        try {
            System.out.println("Enter one more color: ");
            arr[5] = sc.next();
        }catch(Exception e) {
            System.out.println(e);
        }
        try {
            int a = Integer.parseInt(arr[0]);
            System.out.println(a);
        }catch(NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("END OF PROGRAM");
    }
}
