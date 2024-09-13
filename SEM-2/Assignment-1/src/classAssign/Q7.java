package classAssign;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of elements of array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int c1 = 0, c2 = 0;
//        FOR FINDING THE MAX AND MINIMUM ELEMENT:-
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
//        NO. OF TIMES MAX AND MIN OCCURS:-
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                c1++;
            }
            if(arr[i] == min) {
                c2++;
            }
        }
        System.out.println("Maximum element of Array is: "+max+" and occurs "+c1+" times");
        System.out.println("Minimum element of Array is: "+min+" and occurs "+c2+" times");
//        First occurrence of Max:-
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                n = i;
                break;
            }
        }
        System.out.println("First occurrence of maximum element is at position "+(n+1));
//        Last occurrence of Min:-
        int m = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == min) {
                m = i;
                break;
            }
        }
        System.out.println("Last occurrence of minimum element is at position: "+(m+1));
    }
}
