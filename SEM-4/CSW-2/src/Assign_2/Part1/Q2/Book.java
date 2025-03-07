package Assign_2.Part1.Q2;

public class Book {
    private int bookId;
    private String bookName;
    private float price;

    public Book(int bookId, String bookName, float price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public String getBookName() {
        return bookName;
    }

    public String toString() {
        return bookId+"--"+bookName+"--"+price;
    }

//    public boolean equals(Object obj) {
//
//    }
}
