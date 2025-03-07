package Assign_2.Part2.Q9;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,5,43,6,7,1};
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> repeatingNum = new HashSet<>();
        for (int j : arr) {
            boolean dup = hs.add(j);
            if (!dup) {
                repeatingNum.add(j);
            }
        }
        System.out.println(repeatingNum);
        System.out.println(hs);
    }
}
