package Assign_1.Q7;

public class Magazine extends LibraryResourse{
    private int issueDate;

    public Magazine(String title, String author, int issueDate) {
        super(title,author);
        this.issueDate = issueDate;
    }

    public void setIssueDate(int date) {
        this.issueDate = date;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public void displayDetails() {
        System.out.println("Book title: "+this.getTitle());
        System.out.println("Book author: "+this.getAuthor());
        System.out.println("Issue date: "+issueDate);
    }
}
