package Assign_1.Q6;

public class Main {
    public static void main(String[] args) {
        College c1 = new College();
        College c2 = new College();
        c1.setCollegeName("ITER");
        c1.setCollegeLoc("Bbsr");
        c2.setCollegeName("LPU");
        c2.setCollegeLoc("Punjab");
        Student s1 = new Student(11,"Pratik",c1);
        Student s2 = new Student(51,"Abhishek", c2);
        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}
