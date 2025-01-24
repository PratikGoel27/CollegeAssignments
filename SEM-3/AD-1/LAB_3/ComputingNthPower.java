package LAB_3;

public class ComputingNthPower {

    public static int NthPower(int base, int power) {
        if(power == 0) {
            return 1;
        }
        return base * NthPower(base,power-1);
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        System.out.println(NthPower(n,m));
    }
}
