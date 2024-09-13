public class Pratik {

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addFisrt(Node start, int data) {
        Node newNode = new Node(data);
        if(start == null) {
            start = newNode;
            return start;
        }
        newNode.next = start;
        start = newNode;
        return start;
    }

    public static Node addLast(Node start, int data) {
        Node newNode = new Node(data);
        if(start == null) {
            start = newNode;
            return start;
        }
        Node temp = start;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return start;
    }

    public static Node addAtAnyIdx(Node start, int data, int idx) {
        Node newNode = new Node(data);
        if(start == null) {
            start = newNode;
            return start;
        }
        Node temp = start;
        int i = 0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return start;
    }

    public static void display(Node start) {
        Node temp = start;
        while(temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverse(Node start) {
        Node prev = null;
        Node curr = start;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start = prev;
        return start;
    }

    public static void main(String[] args) {
        Node start = null;
        start = addFisrt(start,5);
        start = addFisrt(start,4);
        start = addFisrt(start,3);
        System.out.println("Before reversing");
        display(start);
        start = reverse(start);
        System.out.println("After reversing");
        display(start);
    }
}
