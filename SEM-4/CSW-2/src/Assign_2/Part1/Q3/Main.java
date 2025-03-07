package Assign_2.Part1.Q3;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("XZ","Orange",130);
        Car c2 = new Car("XT","Red",150);
        if(c1.compareTo(c2) > 0) {
            System.out.println(c1+" has greater speed");
        }else if(c1.compareTo(c2) < 0) {
            System.out.println(c2+" has greater speed");
        }else {
            System.out.println(c1.getModel()+" and "+c2.getModel()+" Both the cars have same speed");
        }
    }
}
