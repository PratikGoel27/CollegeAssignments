package Assign_2.Part2.Q4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name+"--"+age+"--"+marks;
    }

    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age && marks == student.marks && Objects.equals(name, student.name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> ll = new LinkedList<>();
        ll.add(new Student("Pratik",19,80));
        ll.add(new Student("Rohan",9,82));
        ll.add(new Student("Shekhar",29,85));
        System.out.println(ll);

        //Checking the existence:-
        System.out.println("Enter a Student's Details:-");
        String name = sc.next();
        int age = sc.nextInt();
        int marks = sc.nextInt();
        Student s1 = new Student(name,age,marks);
        System.out.println("Searching based on content:- "+ll.contains(s1));

        //Remove a specified class from the list:-
        System.out.println("Enter the Student name which is to be removed from the list: ");
        String str = sc.next();
        boolean ans = false;
        Iterator<Student> itr = ll.iterator();
        while(itr.hasNext()) {
            Student s = itr.next();
            if(s.getName().equals(str)) {
                itr.remove();
                ans = true;
                break;
            }
        }
        if(ans)
            System.out.println("Removed the Student from the list");
        else
            System.out.println("The specified student is not in the list");
        System.out.println(ll);

        //Count No. of Student objects:-
        System.out.println("No. of Students in the list:- "+ll.size());

        //Overriding equals methods for content comparison:-
        Student s2 = new Student("Ankush",20,90);
        Student s3 = new Student("Ankush",20,90);
        System.out.println("Are both the given objects equal:- "+s2.equals(s3));
    }
}