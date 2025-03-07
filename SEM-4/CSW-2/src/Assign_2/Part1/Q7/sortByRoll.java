package Assign_2.Part1.Q7;

import java.util.Comparator;

public class sortByRoll implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        Integer s1 = o1.getRollNo();
        Integer s2 = o2.getRollNo();
        return s1.compareTo(s2);
    }
}
