import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
}

public class Main {
    public static int size=1;
    public static Node create(Node start) {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.print("Enter the Regd No.:");
        p.regd_no = sc.nextInt();
        System.out.print("Enter the Marks:");
        p.mark = sc.nextFloat();
        p.next = null;
        size++;
        start = p;
        System.out.print("Do you want to enter more nodes(y/n): ");
        char ch = sc.next().charAt(0);
        while(ch != 'n') {
            Node q = new Node();
            System.out.print("Enter the Regd No.:");
            q.regd_no = sc.nextInt();
            System.out.print("Enter the Marks:");
            q.mark = sc.nextFloat();
            q.next = null;
            p.next = q;
            p = q;
            size++;
            System.out.print("Do you want to enter more nodes(y/n): ");
            ch = sc.next().charAt(0);
        }
        return start;
    }

    public static Node InsBeg(Node start) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.print("Enter the Regd No.:");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter the Marks:");
        newNode.mark = sc.nextFloat();
        size++;
        if(start == null) {
            start = newNode;
            return start;
        }
        newNode.next = start;
        start = newNode;
        return start;
    }

    public static Node InsEnd(Node start) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.print("Enter the Regd No.:");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter the Marks:");
        newNode.mark = sc.nextFloat();
        newNode.next = null;
        size++;
        if(start == null) {
            start = newNode;
            return start;
        }
        Node temp = start;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = start;
        return start;
    }

    public static Node InsAny(Node start) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.print("Enter the Regd No.:");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter the Marks:");
        newNode.mark = sc.nextFloat();
        System.out.print("Enter the index at which you want to enter the node: ");
        int idx = sc.nextInt();
        int i = 0;
        Node temp = start;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return start;
    }

    public static Node DelBeg(Node start) {
        if(start == null) {
            System.out.println("Linked List is already empty");
            return start;
        }
        else if(size == 1) {
            start = null;
            return start;
        }else {
            start = start.next;
        }
        return start;
    }
    public static Node DelEnd(Node start) {
        Node temp = start;
        int i = 0;
        while(i < size-2) {
            temp = temp.next;
            i++;
        }
        temp.next = null;
        return start;
    }

    public static Node DelAny(Node start) {
        Scanner sc = new Scanner(System.in);
        Node temp = start;
        System.out.print("Enter the index of which you want to delete the node: ");
        int idx = sc.nextInt();
        int i = 0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return start;
    }

    public static void search(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the regd Number to be searched: ");
        int val = sc.nextInt();
        Node temp = start;
        while(temp != null) {
            if(temp.regd_no == val) {
                System.out.println("The node is present");
                return;
            }else
                temp = temp.next;
        }
        System.out.println("The node is not present");
    }

    public static void sort() {

    }

    public static int count(Node start) {
        int count = 1;
        Node temp = start;
        while(temp.next != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void reverse() {

    }

    public static void display(Node start) {
        if(start == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = start;
        while(temp != null) {
            System.out.println(temp.regd_no+"-----"+temp.mark);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null;
        boolean a = true;
        while(a) {
            System.out.println("\t\t\t\t\t\t-----------------------------------------------------\n");
            System.out.println("\t\t\t\t\t\t\t\t\t************MENU************\n");
            System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t0: Exit");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t1: Creation");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t2: Display");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t3: Add at beg");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t4: Add at end");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t5: Add at any");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t6: Delete from start");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t7: Delete from end");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t8: Delete any");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t9: Search");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t10: Sort");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t11: Count");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t12: Reverse");
            System.out.println("\t\t\t\t\t\t-----------------------------------------------------\n");
            System.out.println("\t\t\t\t\t\t-----------------------------------------------------\n");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0:
                    System.out.println("Thank you!!");
                    a=false;
                    break;
                case 1: start = create(start);
                    break;
                case 2: display(start);
                    break;
                case 3: start = InsBeg(start);
                    break;
                case 4: start = InsEnd(start);
                    break;
                case 5: start = InsAny(start);
                    break;
                case 6: start = DelBeg(start);
                    break;
                case 7: start = DelEnd(start);
                    break;
                case 8: start = DelAny(start);
                    break;
                case 9: search(start);
                    break;
                case 10: sort();
                    break;
                case 11: count(start);
                    break;
                case 12: reverse();
                    break;
                default:
                    System.out.println("Wrong input pls enter again");
            }
        }
    }
}