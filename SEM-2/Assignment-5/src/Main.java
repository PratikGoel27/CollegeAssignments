import java.util.Scanner;

class Node
{
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
}

public class Main {
    public static int size;

    public static void display(Node start, Node end) {
        if(start == null) {
            System.out.println("Empty Linked List pls create a Node first\n");
            return;
        }
        Node temp = start;
        while(temp != null) {
            System.out.print(temp.regd_no+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node create(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.print("Enter the registration number: ");
        p.regd_no = sc.nextInt();
        System.out.print("Enter the marks: ");
        p.mark = sc.nextFloat();
        p.next = null;
        p.prev = null;
        size++;
        start = p;
        end = p;
        System.out.print("Do you want to enter more nodes(y/n): ");
        char ch = sc.next().charAt(0);
        while(ch != 'n') {
            Node q = new Node();
            System.out.print("Enter the registration number: ");
            q.regd_no = sc.nextInt();
            System.out.print("Enter the marks: ");
            q.mark = sc.nextFloat();
            p.next = q;
            q.prev = p;
            q.next = null;
            size++;
            end = q;
            p = q;
            System.out.print("Do you want to enter more nodes(y/n): \n");
            ch = sc.next().charAt(0);
        }
        return start;

    }

    public static Node insBeg(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.print("Enter the registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter the marks: ");
        newNode.mark = sc.nextFloat();
        newNode.next = null;
        size++;
        if (start == null) {
            start = end = newNode;
            return start;
        }
        newNode.next = start;
        start = newNode;
        System.out.print("Do you want to continue: (y/n): ");
        int choice = sc.next().charAt(0);
        while(choice != 'n') {
            Node newNode2 = new Node();
            System.out.print("Enter the registration number: ");
            newNode2.regd_no = sc.nextInt();
            System.out.print("Enter the marks: ");
            newNode2.mark = sc.nextFloat();
            newNode2.next = start;
            start = newNode2;
            newNode = newNode2;
            System.out.print("Do you want to continue: (y/n): ");
            choice = sc.next().charAt(0);
        }
        return start;
    }

    public static Node insEnd(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.print("Enter the registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter the marks: ");
        newNode.mark = sc.nextFloat();
        newNode.next = null;
        size++;
        if (start == null) {
            start = end = newNode;
            return start;
        }
        end.next = newNode;
        end = newNode;
        return start;
    }

    public static Node insAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.print("Enter the registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter the marks: ");
        newNode.mark = sc.nextFloat();
        newNode.next = null;
        size++;
        if(start == null) {
            start = end = newNode;
            return start;
        }
        System.out.print("Enter the index at which you want to enter a node: ");
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

    public static Node delBeg(Node start, Node end) {
        if(start == null) {
            System.out.println("Linked List is empty");
            return start;
        }
        if(size == 1) {
            size--;
            start = end = null;
            return start;
        }
        start = start.next;
        size--;
        return start;
    }

    public static Node delEnd(Node start, Node end) {
        if(start == null) {
            System.out.println("Linked list is already empty");
            return start;
        }
        else if(size == 1) {
            size--;
            start = end = null;
            return start;
        }
        else {
            Node temp = start;
            int i = 0;
            while(i < size-2) {
                temp = temp.next;
                i++;
            }
            temp.next = null;
            end = temp;
            return start;
        }
    }

    public static Node delAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        if(start == null) {
            System.out.println("Linked list is already empty");
            return start;
        }
        else if(size == 1) {
            size--;
            start = end = null;
            return start;
        }
        System.out.print("Enter the index at which you want to delete a node: ");
        int idx = sc.nextInt();
        int i = 0;
        Node temp = start;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return start;
    }

    public static void search(Node start) {
        if(start == null) {
            System.out.println("Your Linked List is empty\n");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the registration number which is to be searched: ");
        int val = sc.nextInt();
        Node temp = start;
        while(temp != null) {
            if(temp.regd_no == val) {
                System.out.println("A Node is present with this data\n");
                return;
            }else {
                temp = temp.next;
            }
        }
        System.out.println("Node is not present");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null;
        Node end = null;
        while(true) {
            System.out.println("****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at begening");
            System.out.println("4: Insert at end");
            System.out.println("5: Insert at any position");
            System.out.println("6: Delete first");
            System.out.println("7: Delete end");
            System.out.println("8: Delete from any position");
            System.out.println("9: Searching");
            System.out.println("*************\n");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0:
                    System.out.println("Thank you");
                    System.exit(0);
                break;
                case 1: start = create(start,end);
                break;
                case 2: display(start,end);
                break;
                case 3: start = insBeg(start,end);
                break;
                case 4: start = insEnd(start,end);
                break;
                case 5: start = insAny(start,end);
                break;
                case 6: start = delBeg(start,end);
                break;
                case 7: start = delEnd(start,end);
                break;
                case 8: start = delAny(start,end);
                break;
                case 9: search(start);
                break;
                default:
                    System.out.println("Wrong input please try again");

            }
        }


    }
}