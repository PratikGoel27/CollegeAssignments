package classAssign;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Weight: ");
        float w = sc.nextFloat();
        System.out.print("Enter the Hieght: ");
        float h = sc.nextFloat();
        float BMI = w/(h*h);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        }else if(BMI>=18.5 && BMI<24.9) {
            System.out.println("Normal Weight");
        }else if(BMI>=24.9 && BMI<29.9) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
        sc.close();
    }
}

