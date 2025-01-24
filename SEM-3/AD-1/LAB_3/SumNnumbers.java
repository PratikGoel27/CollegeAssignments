package LAB_3;

public class SumNnumbers {
    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
    public static int Sum(int n) {
        if(n == 1) {
            return n;
        }
        return n + Sum(n-1);
    }
}
