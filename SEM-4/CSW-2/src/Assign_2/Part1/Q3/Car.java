package Assign_2.Part1.Q3;

public class Car implements Comparable<Car> {
    private String model;
    private String color;
    private float speed;

    public Car(String model, String color, float speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public float getSpeed() {
        return speed;
    }

    public int compareTo(Car obj) {
        float c1 = this.getSpeed();
        float c2 = obj.getSpeed();
        if(c1 < c2) {
            return -1;
        }else if(c1 > c2) {
            return +1;
        }else {
            return 0;
        }
    }

    public String toString() {
        return "["+model+", "+color+", "+speed+"]";
    }
}
