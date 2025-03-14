package Assign_2.Part1.Q1;

public class Student<T> {
    private String name;
    private int age;
    private T rollNum;

    public Student(String name, int age, T rollNum) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getRollNum() {
        return rollNum;
    }

    public void setRollNum(T rollNum) {
        this.rollNum = rollNum;
    }

    public String toString() {
        return name+","+rollNum+","+age;
    }
}
