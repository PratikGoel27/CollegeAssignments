import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Student s1 = new Student();
        System.out.println("Enter your lucky number: ");
        int a = sc.nextInt();
        try {
            if(a < 0) {
                throw new NumberFormatException();
            }
            System.out.println("Your lucky num: "+a);
        }catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}
//class MarksOutOfBoundException extends Exception{
//    MarksOutOfBoundException(String msg) {
//        super(msg);
//    }
//}
//class Student {
//    int marks;
//    String name;
//    Student() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name: ");
//        this.name = sc.next();
//        System.out.println("Enter the marks: ");
//        try {
//            this.marks = sc.nextInt();
//            if(marks > 100) {
//                throw new MarksOutOfBoundException("this not allowed");
//            }
//        }catch(MarksOutOfBoundException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
