package Assign_1.Q1;

public class CarTester {
    public static void main(String[] args) {
        Car myCar1 = new Car("Tiago","XT");
        Car myCar2 = new Car();
        System.out.println("Initial Values:-");
        System.out.println("MyCar1-->"+myCar1.getName()+" "+myCar1.getModel());
        System.out.println("MyCar2-->"+myCar2.getName()+" "+myCar2.getModel());
        myCar2.setName("Tiago");
        myCar2.setModel("XZ");
        System.out.println("Updated details:- ");
        System.out.println("MyCar2-->"+myCar2.getName()+" "+myCar2.getModel());
    }
}
