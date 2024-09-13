package homeAssign;

public class Q1 {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int sum = 0;
        for (int i =1; i <= 10; i++) {
            sumOfSquares += (i*i);
            sum += i;
        }
        System.out.println(Math.pow(sum,2)-sumOfSquares);
    }
}
