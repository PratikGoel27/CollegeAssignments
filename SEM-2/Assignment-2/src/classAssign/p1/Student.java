package classAssign.p1;
import java.util.*;
public class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    int roll;
    void inputDetails() {
        System.out.println("Enter the name nd roll: ");
        name = sc.nextLine();
        roll = sc.nextInt();
    }
    void showDetails() {
        System.out.println("The name of the student is: "+name);
        System.out.println("The roll of the student is: "+roll);
    }
}
