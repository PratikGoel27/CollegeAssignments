package Assign_1.Q7;

public class LibrarySystem {
    public static void main(String[] args) {
        Book b = new Book("Atomic Habits", "James Clear", 300);
        Magazine m = new Magazine("Physcology of Money", "Hello", 24);
        DVD d = new DVD("hello", "hello", 120);
        b.displayDetails();
        m.displayDetails();
        d.displayDetails();
    }
}
