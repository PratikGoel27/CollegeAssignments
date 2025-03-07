package Assign_2.Part2.Q6;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> t = new TreeSet<>();
        t.add(41);
        t.add(19);
        t.add(25);
        t.add(36);
        System.out.println(t);
        System.out.println("Enter a num: ");
        Integer num = sc.nextInt();
        System.out.println(t.contains(num));
        System.out.println("Enter the number which is to be deleted:- ");
        Integer a = sc.nextInt();
        t.remove(a);
        System.out.println(t);
    }
}
