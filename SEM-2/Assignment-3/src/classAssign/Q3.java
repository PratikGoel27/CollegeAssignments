package classAssign;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    int marks;
    Student() {
        System.out.println("Enter the name: ");
        this.name = sc.next();
        System.out.println("Enter the marks: ");
        try {
            marks = sc.nextInt();
            if(marks > 100) {
                throw new MarksOutOfBoundException("Marks can't be more than 100");
            }
        }catch (MarksOutOfBoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
class MarksOutOfBoundException extends Exception {
    MarksOutOfBoundException(String msg) {
        super(msg);
    }
}
