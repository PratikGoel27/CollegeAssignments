package Assign_1.Q8;

public class BankingApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(123456,1000,3.5f);
        CurrentAccount ca = new CurrentAccount(123456,5000,5000);
        sa.deposit(500);
        sa.withdrawal(1000);
        sa.withdrawal(10000);
        ca.withdrawal(10000);
    }
}
