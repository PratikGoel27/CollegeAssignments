package Assign_2.Part2.Q2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUser {
    public static void main(String[] args) {
        ArrayList<User> al = new ArrayList<>();
        al.add(new User("Sobhit",45));
        al.add(new User("Abhishek",27));
        al.add(new User("Pratik",19));
        Collections.sort(al);
        System.out.println(al);
    }
}
