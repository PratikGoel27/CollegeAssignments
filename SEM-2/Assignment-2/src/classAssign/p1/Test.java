package classAssign.p1;
import java.util.*;
public class Test extends Student{
    Scanner sc = new Scanner(System.in);
    int mark1;
    int mark2;
    public void inputDetails() {
        System.out.println("Enter the marks: ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
    }
    public void showDetails() {
        System.out.println("The name of the student is: "+mark1);
        System.out.println("The roll of the student is: "+mark2);
    }
}


