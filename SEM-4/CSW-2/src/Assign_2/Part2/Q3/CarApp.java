package Assign_2.Part2.Q3;


import java.util.ArrayList;
import java.util.Collections;

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> al = new ArrayList<>();
        al.add(new Car(2015,"BMW",55));
        al.add(new Car(2020, "MG", 13));
        al.add(new Car(2018, "Kia", 20));
        Collections.sort(al);
        System.out.println(al);
    }
}
