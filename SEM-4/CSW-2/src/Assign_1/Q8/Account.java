package Assign_1.Q8;

abstract public class Account {
    private long accountNum;
    private double balance;

    public Account(long accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    abstract public void deposit(double amount);

    abstract public void withdrawal(double amount);

    public long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }
}