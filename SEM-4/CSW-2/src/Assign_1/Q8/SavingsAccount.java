package Assign_1.Q8;

public class SavingsAccount extends Account {
    private float interestRate;

    public SavingsAccount(long accNum, double balance, float interestRate) {
        super(accNum,balance);
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        double interestAmt = (this.getBalance() + amount) * (interestRate/100);
        this.setBalance(this.getBalance()+interestAmt+amount);
        System.out.println("Deposit Amount: "+amount);
        System.out.println("Balance: "+this.getBalance());
    }

    public void withdrawal(double amount) {
        if(amount > this.getBalance()) {
            System.out.println("Insufficient balance");
        }else {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Amount withdrawn: "+ amount);
            System.out.println("Balance: "+this.getBalance());
        }
    }
}