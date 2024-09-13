package homeAssign;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Bank[] arr = new Bank[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=new Bank();
            arr[i].setBankName();
            arr[i].setAmount();
            Bank.totalAmount += arr[i].depositAmount;
        }
        System.out.println(Bank.totalAmount);
    }
}
class Bank {
    Scanner sc = new Scanner(System.in);
    String bankName;
    double depositAmount;
    static double totalAmount;
    void setBankName() {
        System.out.println("Enter the bank name: ");
        bankName = sc.next();
    }
    void setAmount() {
        System.out.println("Enter the deposit amount: ");
        depositAmount = sc.nextDouble();
        if(depositAmount < 1000) {
            System.out.println("Minimum deposit amount is 1000");
        }
    }
    void showData() {
        System.out.println("The bank name is: "+bankName);
        System.out.println("The deposit amount is: "+depositAmount);
    }
}
