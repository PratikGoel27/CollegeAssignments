package homeAssign;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] arr = new Book[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the book name, edition and price");
            String name = sc.next();
            int edition = sc.nextInt();
            double price = sc.nextDouble();
            arr[i] = new Book(name,edition,price);
        }
        double a = Double.MIN_VALUE;
        int b = 0;
        for (int i = 0; i < 5; i++) {
            if(arr[i].BPrice > a) {
                a = arr[i].BPrice;
                b = i;
            }
        }
        System.out.println("Book details with max price: ");
        arr[b].display();
    }
}
class Book {
    String BName;
    int BookEdition;
    double BPrice;
    Book(String BName ,int BookEdition ,double BPrice) {
        this.BName = BName;
        this.BookEdition = BookEdition;
        this.BPrice = BPrice;
    }
    void display() {
        System.out.println("Book name is: "+BName);
        System.out.println("Editon is: "+BookEdition);
        System.out.println("Price is: "+BPrice);
    }
}
