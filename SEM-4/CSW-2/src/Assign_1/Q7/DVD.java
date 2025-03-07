package Assign_1.Q7;

public class DVD extends LibraryResourse {
    private int duration;

    public DVD(String author, String title, int duration) {
        super(title,author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Book title: "+this.getTitle());
        System.out.println("Book author: "+this.getAuthor());
        System.out.println("Duration: "+duration);
    }
}
