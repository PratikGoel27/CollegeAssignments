package homeAssign;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sale: ");
        int s = sc.nextInt();
        if (s < 0) {
            System.out.println("Invalid Input");
        }else {
            Commision c1 = new Commision(s);
            System.out.println("Commision is: "+c1.getCommision());
        }
    }
}
class Commision {
    int sale;
    Commision(int sale) {
        this.sale = sale;
    }
    double getCommision() {
        if(sale < 500) {
            return 0.02*sale;
        }else if(500 <= sale && sale < 5000) {
            return 0.05*sale;
        }else {
            return 0.08*sale;        }
    }
}
