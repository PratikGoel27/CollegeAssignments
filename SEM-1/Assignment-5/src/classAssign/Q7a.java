package classAssign;

public class Q7a {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            char a = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
