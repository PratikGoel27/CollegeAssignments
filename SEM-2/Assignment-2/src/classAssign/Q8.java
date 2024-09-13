package classAssign;
import classAssign.p1.Test;

public class Q8 {

    public static void main(String[] args) {
        Test s1 = new Test();
        s1.inputDetails();
        animal h = new horse();
        h.age = 20;
    }
}
class animal {
    public animal() {
    }
    int age;
}
class horse extends animal {
    int roll;
}
abstract class hello {

}