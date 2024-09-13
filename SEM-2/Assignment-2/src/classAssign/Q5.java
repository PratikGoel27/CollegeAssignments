package classAssign;

public class Q5 {
}
class Persons {
    String name;
    int age;
    Persons() {

    }
    Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Persons {
    int Eid;
    double salary;
    Employee(String name, int age, int Eid, double salary) {
        this.name = name;
        this.age = age;
        this.Eid = Eid;
        this.salary = salary;
    }
    void empDisplay() {
        System.out.println("The name of the employee is: "+name);
        System.out.println("The age of the employee: "+age);
        System.out.println("Employee id is: "+Eid);
        System.out.println("Salary is: "+salary);
    }
}
