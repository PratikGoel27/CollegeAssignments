package classAssign;

public class Q5 {
//    public static int sum_Of_Digits(int n) {
//        int sum = 0;
//        while (n > 0) {
//            int c = n % 10;
//            sum += c;
//            n/=10;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        int sum = sum_Of_Digits(9249);
//        while(sum >= 9) {
//            sum = sum_Of_Digits(sum);
//        }
//        System.out.println(sum);
//    }
    public static int sum_Of_Digits(int n) {
        int ans = 0;
        while(n > 0) {
            int c = n % 10;
            ans += c;
            n /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int sum = sum_Of_Digits(9294);
        while(sum > 9) {
            sum = sum_Of_Digits(sum);
        }
        System.out.println(sum);
    }


}
