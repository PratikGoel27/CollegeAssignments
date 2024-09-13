import java.util.Scanner;

public class StacksUsingArr {
    static Scanner sc = new Scanner(System.in);
    public static final int Max = 10;
    public static int top = -1;

    public static int push(int[] S, int top) {
        if(isFull(top)) {
            System.out.println("Stack Overflow");
            return top;
        }
        S[++top] = sc.nextInt();
        return top;
    }

    public static int pop(int[]S, int top) {
        if(isEmpty(top)) {
            System.out.println("Stack Underflow");
            return top;
        }
        return --top;
    }

    public static void display(int[]S, int top) {
        for (int i = 0; i <= top; i++) {
            System.out.print(S[i]+" ");
        }
        System.out.println();
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top) {
        return top == Max-1;
    }

    public static void main(String[] args) {
        int[] S = new int[Max];
        top = push()
    }
}
