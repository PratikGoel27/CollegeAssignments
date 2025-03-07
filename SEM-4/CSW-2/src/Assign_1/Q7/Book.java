package Assign_1.Q7;

public class Book extends LibraryResourse {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void displayDetails() {
        System.out.println("Book title: "+this.getTitle());
        System.out.println("Book author: "+this.getAuthor());
        System.out.println("Page count: "+pageCount);
    }
}
