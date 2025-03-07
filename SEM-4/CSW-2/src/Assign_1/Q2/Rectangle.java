package Assign_1.Q2;

public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    
    public  double getWidth() {
        return width;
    }
    
    public double area(double length, double width) {
        return length*width;
    }
    
    public double perimeter(double length, double width) {
        return 2*(length+width);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.2,3.6);
        System.out.println("Area: "+r1.area(r1.getLength(), r1.getWidth()));
        System.out.println("Perimeter: "+r1.perimeter(r1.getLength(), r1.getWidth()));

    }
}
