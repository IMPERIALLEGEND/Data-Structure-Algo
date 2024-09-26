class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class CreateLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = insertNode(head, 5, 0);
        head = insertNode(head, 50, -1);
        head = insertNode(head, 15, 6);

        head = deleteNode(head, 0);
        head = deleteNode(head, -1);

        reverseLinkedList(head);
        print(head);
        // recursive_print(head);

        // System.out.println(iterativeSearch(head, 20));
        System.out.println(recursiveSearch(head, 10));
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");

            temp = temp.next;
        }
        System.out.println();
    }

    public static void recursive_print(Node temp) {
        if (temp == null) {
            return;
        }
        System.out.print(temp.data + " ");
        recursive_print(temp.next);
    }

    public static Node insertNode(Node head, int data, int pos) {
        if (pos == 0) {
            return insertNodeAtHead(head, data);
        }

        else if (pos == -1) {
            return insertNodeAtEnd(head, data);
        } else {
            return insertNodeAtPos(head, pos, data);
        }
    }

    public static Node insertNodeAtHead(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    public static Node insertNodeAtEnd(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            return temp;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = temp;

        return head;
    }

    public static Node insertNodeAtPos(Node head, int pos, int data) {

        Node temp = new Node(data);
        Node curr = head;
        int count = 1;

        while (count != pos) {
            curr = curr.next;
            count++;
            if (curr == null) {
                System.out.println("Out of Range");
                return head;
            }
        }

        temp.next = curr.next;
        curr.next = temp;

        return head;
    }

    private static Node deleteNode(Node head, int pos) {

        if (pos == 0) {
            return deleteNodeAtHead(head);
        } else if (pos == -1) {
            return deleteNodeAtEnd(head);
        }
        return head;
    }

    private static Node deleteNodeAtHead(Node head) {
        if (head == null) {
            return null;
        }
        return head.next;
    }

    private static Node deleteNodeAtEnd(Node head) {

        if (head == null) {
            System.out.println("No Items in Linked List");
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static int iterativeSearch(Node head, int key) {
        Node curr = head;
        int pos = 1;
        while (curr != null) {
            if (curr.data == key) {
                return pos;
            }
            pos++;
            curr = curr.next;
        }

        return -1;
    }

    public static int recursiveSearch(Node head, int data) {
        if (head == null) {
            return -1;
        }
        if (head.data == data) {
            return 1;
        }

        return recursiveSearch(head.next, data) != -1 ? recursiveSearch(head.next, data) + 1 : -1;
    }

    public static Node reverseLinkedList(Node head) {

        Node prev = null;
        Node curr = head;
        Node next = null;

        if (head == null || head.next == null)
            return head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    }
}
