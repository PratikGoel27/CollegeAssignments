package classAssign;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product arr[] = new Product[5];
//        Product p1 = new Product(123,10,10);
//        Product p2 = new Product(124,20,10);
//        Product p3 = new Product(125,5,20);
//        Product p4 = new Product(126,100,2);
//        Product p5 = new Product(127,50,3);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the product id: ");
            int pID = sc.nextInt();
            System.out.print("Enter the price: ");
            double price = sc.nextDouble();
            System.out.print("Enter the quantity: ");
            int quan = sc.nextInt();
            arr[i] = new Product(pID,price,quan);
            arr[i].display();
            Product.totalPrice += (arr[i].price)*(arr[i].quantity);
        }
        System.out.println("Total price is: "+Product.totalPrice);
    }
}

class Product {
    int prodId;
    double price;
    int quantity;
    static double totalPrice;
    Product() {

    }
    Product(int prodId, double price, int quantity) {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
    }
    void display() {
        System.out.println("The product ID is: "+prodId);
        System.out.println("The price is: "+price);
        System.out.println("Quantity is: "+quantity);
    }
}
