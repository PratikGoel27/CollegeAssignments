package classAssign;
import java.util.*;
class Person {
    String name;
    int age;
    void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.next();
        System.out.print("Enter the age: ");
        age = sc.nextInt();
    }
    void displayData() {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Rohan";
        p1.age = 20;
        p2.setData();
        p1.displayData();
        p2.displayData();
        if(p1.age > p2.age) {
            System.out.println(p2.name+" is younger");
        }else if(p1.age == p2.age) {
            System.out.println("Both "+p1.name +" and "+p2.name+" are of same age");
        }else {
            System.out.println(p1.name+" is younger");
        }
    }
}


