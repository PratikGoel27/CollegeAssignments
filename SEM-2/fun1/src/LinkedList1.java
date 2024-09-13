//import java.util.Scanner;
//
//class Node
//{
//    protected int regd_no;
//    protected float mark;
//    protected Node next;
//    protected Node prev;
//}
//
//public class LinkedList1 {
//    static Scanner sc = new Scanner(System.in);
//    public static Node create(Node start, Node end) {
//
////        Node p = new Node();
////        System.out.print("Enter the registration number: ");
////        p.regd_no = sc.nextInt();
////        System.out.print("Enter the marks: ");
////        p.mark = sc.nextFloat();
////        p.next = null;
////        p.prev = null;
////        start = p;
////        System.out.print("Do you want to enter more nodes(y/n): ");
////        char ch = sc.next().charAt(0);
////        while(ch != 'n') {
////            Node q = new Node();
////            System.out.print("Enter the registration number: ");
////            q.regd_no = sc.nextInt();
////            System.out.print("Enter the marks: ");
////            q.mark = sc.nextFloat();
////            q.next = null;
////        }
//        do {
//            Node p = new Node();
//            System.out.print("Enter the registration number: ");
//            p.regd_no = sc.nextInt();
//            System.out.print("Enter the marks: ");
//            p.mark = sc.nextFloat();
//            p.next = null;
//            p.prev = null;
//            if(start == null) {
//                start = p;
//            }else {
//                end.next = p;
//                p.prev = end;
//            }
//            end = p;
//            System.out.println("Continue adding nodes(y/n): ");
//        }while(sc.next().charAt(0) != 'n');
//        return start;
//    }
//
//    public static Node insBeg(Node start, Node end) {
//        Node newNode = new Node();
//        if(start == null) {
//            start = end = newNode;
//            return start;
//        }
//        newNode.next = start;
//        newNode.prev = null;
//        start.prev = newNode;
//        start = newNode;
//        return start;
//    }
//
//    public static Node insEnd(Node start, Node end) {
//        Node newNode = new Node();
//        if(start == null) {
//            start = end = newNode;
//            return start;
//        }
//        end.next = newNode;
//        newNode.prev = end;
//        end = newNode;
//        return start;
//    }
//
//
//    public static void display(Node start) {
//        Node temp = start;
//        if(start == null) {
//            System.out.println("LL is empty");
//            return;
//        }
//        while(temp != null) {
//            System.out.println(temp.regd_no+" "+temp.mark);
//            temp = temp.next;
//        }
//    }
//
//    public static Node insAny(Node start, Node end) {
//        Node newNode = new Node();
//        System.out.print("Enter the registration number: ");
//        newNode.regd_no = sc.nextInt();
//        System.out.print("Enter the marks: ");
//        newNode.mark = sc.nextFloat();
//        if(start == null) {
//            start = end = newNode;
//            return start;
//        }
//        System.out.print("Enter the index at which you want to insert a node: ");
//        int idx = sc.nextInt();
//        Node temp = start;
//        while(--idx >= 1) {
//            temp = temp.next;
//        }
//
//        newNode.next = temp.next;
//        temp.next = newNode;
//        newNode.prev = temp;
//        newNode.next.prev = newNode;
//        return start;
//    }
//
//    public static Node delBeg(Node start, Node end) {
//        if(start == null) {
//            System.out.println("LL is empty");
//            return start;
//        }
//        start = start.next;
//        return start;
//    }
//
//    public static Node delEnd(Node start, Node end) {
//        if(start == null) {
//            System.out.println("LL is empty");
//            return start;
//        }
//        end = end.prev;
//        end.next = null;
//        return start;
//    }
//
//    public static Node delAny(Node start, Node end) {
//        if(start == null) {
//            System.out.println("LL is empty");
//            return start;
//        }
//        System.out.print("Enter the index of which you want to delete the node: ");
//        int idx = sc.nextInt();
//        int i = 0;
//        Node temp = start;
//        while(i < idx-1) {
//            temp = temp.next;
//            i++;
//        }
//        temp.next = temp.next.next;
//        return start;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Node start = null;
//        Node end = null;
//        while(true) {
//            System.out.println("****MENU*****");
//            System.out.println("0: Exit");
//            System.out.println("1: Creation");
//            System.out.println("2: Display");
//            System.out.println("3: Insert at begening");
//            System.out.println("4: Insert at end");
//            System.out.println("5: Insert at any position");
//            System.out.println("6: Delete first");
//            System.out.println("7: Delete end");
//            System.out.println("8: Delete from any position");
//            System.out.println("9: Searching");
//            System.out.println("*************\n");
//            System.out.print("Enter your choice: ");
//            int choice = sc.nextInt();
//            switch(choice) {
//                case 0:
//                    System.out.println("Thank you");
//                    System.exit(0);
//                    break;
//                case 1: start = create(start,end);
//                    break;
//                case 2: display(start);
//                    break;
//                case 3: start = insBeg(start,end);
//                    break;
//                case 4: start = insEnd(start,end);
//                    break;
//                case 5: start = insAny(start,end);
//                    break;
//                case 6: start = delBeg(start,end);
//                    break;
//                case 7: start = delEnd(start,end);
//                    break;
//                case 8: start = delAny(start,end);
//                    break;
////                case 9: search(start);
////                    break;
//                default:
//                    System.out.println("Wrong input please try again");
//            }
//        }
//    }
//}
//
