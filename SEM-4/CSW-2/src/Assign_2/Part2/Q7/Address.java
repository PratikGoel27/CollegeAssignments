package Assign_2.Part2.Q7;

import java.util.Iterator;
import java.util.TreeMap;

public class Address {
    private int plotNo;
    private String at;
    private int post;

    public Address(int plotNo, String at, int post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address{" +
                "plotNo=" + plotNo +
                ", at='" + at + '\'' +
                ", post=" + post +
                '}';
    }

    public static void main(String[] args) {
        TreeMap<String, Address> tm = new TreeMap<>();
        Address ad1 = new Address(79,"Basanti Colony", 769012);
        Address ad2 = new Address(81,"Chhend Colony", 769013);
        tm.put("Pratik",ad1);
        tm.put("Aman",ad2);

        Iterator<Address> itr = tm.values().iterator();;
        while(itr.hasNext()) {
            Address ad = itr.next();
//            System.out.println(itr.get);
        }
    }
}
