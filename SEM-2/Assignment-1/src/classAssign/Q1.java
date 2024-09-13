package classAssign;

public class Q1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int n = 0;
        while(a > 2) {
           a = a / 2;
           n++;
        }
        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is: "+n);
    }
}
