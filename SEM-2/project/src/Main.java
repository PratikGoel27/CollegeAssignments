import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Member arr[] = new Member[1];
        Member m = new Member();
        m.setData();
        System.out.println("MemberID \t"+"LastName \t"+"FirstName \t"+"Handicap \t"+"Genedr \t"+"Team \t"+"MemberType \t"+"Coach \t"+"Phone \t"+"JoinDate");
        m.display();
        }
    }

class Member {
    private int MemberID;
    private String LastName;
    private String FirstName;
    private int Handicap;
    private char Gender;
    private String Team;
    private String MemberType;
    private int Coach;
    private long Phone;
    private Date JoinDate;

    void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the member ID: ");
        MemberID = sc.nextInt();
        System.out.println("Enter the last name: ");
        LastName = sc.next();
        System.out.println("Enter the fisrt name: ");
        FirstName = sc.next();
        System.out.println("Enter the handicap: ");
        Handicap = sc.nextInt();
        System.out.println("Enter the gender: ");
        Gender = sc.next().charAt(0);
        System.out.println("Enter the team: ");
        Team = sc.next();
        System.out.println("Enter the member type: ");
        MemberType = sc.next();
        System.out.println("Enter the coach: ");
        Coach = sc.nextInt();
        System.out.println("Enter the phone num: ");
        Phone = sc.nextLong();
//        System.out.println("Enter the join of date: ");
//        for (int i = 1; )

    }
    void display() {
        System.out.println(MemberID+"\t"+LastName+"\t"+FirstName+"\t"+Handicap+"\t"+Gender+"\t"+Team+"\t"+MemberID+"\t"+Coach+"\t"+Phone+"\t");
//        System.out.println(LastName);
//        System.out.println(FirstName);
//        System.out.println(Handicap);
//        System.out.println(Gender);
//        System.out.println(Team);
//        System.out.println(MemberType);
//        System.out.println(Coach);
//        System.out.println(Phone);
//        System.out.println(MemberID);
    }
}

class Date {
    private int day;
    private String month;
    private int year;
    Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}