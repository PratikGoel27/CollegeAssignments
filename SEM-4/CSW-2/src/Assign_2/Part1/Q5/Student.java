package Assign_2.Part1.Q5;

import java.util.Scanner;

public class Student implements Comparable<Student> {
    private String name;
    private int rollNumber;
    private float totalMark;

    public Student(String name, int rollNumber, float totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String toString() {
        return name+"--"+rollNumber+"--"+totalMark;
    }

    public int compareTo(Student obj) {
        int s1 = this.getRollNumber();
        int s2 = obj.getRollNumber();
        if(s1 < s2) {
            return -1;
        }else if(s1 > s2) {
            return +1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students you want to enter:- ");
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        System.out.println("Enter the Student details:- ");
        for(int i = 0; i < n; i++) {
            Student s = new Student(sc.next(),sc.nextInt(),sc.nextFloat());
            arr[i] = s;
        }
//        Bubble Sort:-
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
