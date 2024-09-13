package classAssign;
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row nd column of 2D Array: ");
        int n = sc.nextInt(), sum = 0;
        int[][] arr = new int[n][n];
//      Entering elements:-
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
//      Printing elements:-
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
