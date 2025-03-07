package Assign_2.Part1.Q7;

import java.util.Comparator;

public class sortByAge implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        Integer s1 = o1.getAge();
        Integer s2 = o2.getAge();
        return s1.compareTo(s2);
    }
}
