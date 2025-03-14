package Assign_2.Part2.Q10;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1,2,4,3,5,6,7};
//        Arrays.sort(arr);
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            hm.put((i + 1), arr[i]);
//            if (hm.get(i + 1) != (i+1)) {
//                System.out.println("Smallest +ve missing Num is: " + (i+1));
//                break;
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,7};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, 1);
        } int missingNo = -1;
        for (int i = 1; i <= 10; i++) {
            if (!map.containsKey(i)) {
                missingNo = i; break;
            }
        } if (missingNo != -1) {
            System.out.println("The smallest positive number missing in the array is: " + missingNo);
        } else {
            System.out.println("No positive number is missing in the range 1 to 10.");
        }
    }
}
