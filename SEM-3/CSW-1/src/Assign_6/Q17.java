package Assign_6;

public class Q17 {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(isEven(n));
    }

    public static boolean isEven(int n) {
        return (n&1) == 0;
    }
}
