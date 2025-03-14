package Assign_2.Part2.Q5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Book> hm = new HashMap<>();
        Book b1 = new Book(123,"Java The Complete Refrence",20);
        Book b2 = new Book(124,"Internet of Things",50);
        hm.put(b1.getId(),b1);
        hm.put(b2.getId(), b2);
        System.out.println(hm);
        System.out.println("Enter the book name: ");
        String bookName = sc.nextLine();
//        for (Book b : hm.values()) {
//            if (bookName.equals(b.getName())) {
//                System.out.println("Book is present");
//            }
//        }

        Iterator<Book> itr = hm.values().iterator();
        boolean isPresent = false;
        while(itr.hasNext()) {
            Book b = itr.next();
            if(bookName.equals(b.getName())) {
                isPresent = true;
                break;
            }
        }
        if(isPresent) {
            System.out.println("Book is present in the list");
        }else {
            System.out.println("Book is not present in the list");
        }
    }
}
