package Assign_1.Q6;

public class Student {
    private int studentID;
    private String studentName;
    private College college;

    public Student(int studentID, String studentName, College college) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: "+studentID+
                ", Student Name: "+studentName+
                ", College Name: "+college.getCollegeName()+
                ", College Location: "+college.getCollegeLoc());
    }
}
