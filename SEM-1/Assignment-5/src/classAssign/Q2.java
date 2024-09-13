package classAssign;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No.: ");
        int n = sc.nextInt();
        int N = n;
        boolean a = true , b = true;
//        CHECKING IF N IS A PRIME:-
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                a = false;
            }
        }
//        REVERSING THE NUMBER:-
        int rev = 0;
        while(n > 0) {
            rev = rev*10 + (n%10);
            n/=10;
        }
//        CHECKING IF N IS A PRIME:-
        for (int i = 2; i <= Math.sqrt(rev); i++) {
            if(rev % i == 0) {
                b = false;
            }
        }
        if(a&b) {
            System.out.println(N+" is Twisted Prime");
        }else {
            System.out.println(N+" is Not Twisted Prime");
        }
    }
}
