package LAB_3;

public class FactorialOfNum {
    public static int Fact(int n) {
        if(n == 0) {
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));
    }
}
