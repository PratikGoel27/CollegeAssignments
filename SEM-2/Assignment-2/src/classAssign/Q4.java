package classAssign;

public class Q4 {
    public static void main(String[] args) {
        Deposit d1 = new Deposit();
        Deposit d2 = new Deposit(2000,2,2.5);
        Deposit d3 = new Deposit(3000,3);
        Deposit d4 = new Deposit(4000,5.7);
    }
}
class Deposit {
    long prinicipal;
    int time;
    double rate;
    double totalAmt;
    Deposit(){
    }
    Deposit(long prinicipal, int time, double rate) {
        this.prinicipal = prinicipal;
        this.rate = rate;
        this.time = time;
    }
    Deposit(long prinicipal, int time) {
        this.prinicipal = prinicipal;
        this.time = time;
    }
    Deposit(long prinicipal,double rate) {
        this.prinicipal = prinicipal;
        this.rate = rate;
    }
    void display() {
        System.out.println("The principal amount is"+prinicipal);
        System.out.println("The time is: "+time);
        System.out.println("The rate of interest is: "+rate);
    }
    double calcAmt() {
        return prinicipal+(prinicipal*rate*time)/100;
    }
}
