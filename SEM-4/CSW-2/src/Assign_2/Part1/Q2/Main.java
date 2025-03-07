package Assign_2.Part1.Q2;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(12,"ICP",600);
        Book b2 = new Book(13,"Java",450);
        if(b1.getPrice() > b2.getPrice()) {
            System.out.println(b1.getBookName()+" is more expensive than "+b2.getBookName());
        }else if(b1.getPrice() < b2.getPrice()) {
            System.out.println(b2.getBookName()+" is more expensive than "+b1.getBookName());
        }else {
            System.out.println("Both the Book have same pricing that is: "+b1.getPrice());
        }
        System.out.println("Details of both the books:- ");
        System.out.println(b1);
        System.out.println(b2);
    }
}