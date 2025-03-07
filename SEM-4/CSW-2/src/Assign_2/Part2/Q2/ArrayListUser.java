package Assign_2.Part2.Q2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayListUser {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(new User("Sobhit",45));
        t.add(new User("Abhishek",27));
        t.add(new User("Pratik",19));
        System.out.println(t);
    }
}
