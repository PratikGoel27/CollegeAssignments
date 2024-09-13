package classAssign;

public class Q7 {
    public static void main(String[] args) {

    }
}
interface DetailInfo {
    void display();
    int count();
}

class Persons1 implements DetailInfo {
    static int macount;
    String name;
    public int count() {
        return name.length();
    }
    public void display() {
        System.out.println("The name is: "+name);
        System.out.println("The count is: "+count());
    }
}