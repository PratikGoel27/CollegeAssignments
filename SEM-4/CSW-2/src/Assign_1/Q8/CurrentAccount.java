package Assign_1.Q8;

public class CurrentAccount extends Account {
    private double overDraftLimit;

    public CurrentAccount(long accNum, double balance, double overDraftLimit) {
        super(accNum,balance);
        this.overDraftLimit = overDraftLimit;
    }

    public void withdrawal(double amount) {
        if(amount > (this.getBalance() + overDraftLimit)) {
            System.out.println("You cannot withdraw this amount as it exceeds your overdraft limit");
        }
        this.setBalance(this.getBalance() - amount);
        System.out.println("Amount withdrawn : "+amount);
        System.out.println("Current balance: "+this.getBalance());
    }

    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
        System.out.println("Amount deposited: "+amount);
        System.out.println("Current balance: "+this.getBalance());
    }
}