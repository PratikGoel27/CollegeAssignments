package Assign_1.Q3;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p1) {
        this.x = p1.x;
        this.y = p1.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(2.1,3.1);
        Point p2 = new Point(p1);
        System.out.println("Initial Details:-");
        System.out.println("Point1--> "+p1.getY()+","+p1.getX());
        System.out.println("Point2--> "+p2.getY()+","+p2.getX());
        p1.setX(3.1);
        p1.setY(2.1);
        System.out.println("Updated details:-");
        System.out.println("Point1--> "+p1.getY()+","+p1.getX());
        System.out.println("Point2--> "+p2.getY()+","+p2.getX());
    }
}
