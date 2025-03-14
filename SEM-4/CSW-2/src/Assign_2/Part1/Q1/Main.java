package Assign_2.Part1.Q1;

public class Main {
    public static void main(String[] args) {
        Student<Integer> s1 = new Student<>("pratik",19,234100);
        Student<String> s2 = new Student<>("ankush",51,"234100");
        System.out.println(s1.getRollNum());
        System.out.println(s2.getRollNum());
    }
}