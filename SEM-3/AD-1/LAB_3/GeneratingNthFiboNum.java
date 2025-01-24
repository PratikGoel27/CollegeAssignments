package LAB_3;

public class GeneratingNthFiboNum {
    public static int Fibo(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        return Fibo(n-1) + Fibo(n-2);
    }
    public static void main(String[] args) {

    }
}
