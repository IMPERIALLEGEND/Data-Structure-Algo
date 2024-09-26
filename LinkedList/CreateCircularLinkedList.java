class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class CreateCircularLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        print(head);
    }

    public static void print(Node head) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        } else if (head.next == head) {
            System.out.println(head.data);
            return;
        } else {
            Node curr = head;
            do {
                System.out.print(curr.data + " ");
                curr = curr.next;
            } while (curr != head);

            return;
        }
    }
}
