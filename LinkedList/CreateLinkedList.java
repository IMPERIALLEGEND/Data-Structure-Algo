class Node{
    int data;
    Node next;

    Node(int d){
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
        print(head);
        //recursive_print(head);
    }

    public static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void recursive_print(Node temp){
        if(temp == null){
            return;
        }
        System.out.print(temp.data + " ");
        recursive_print(temp.next);
    }

    public static Node insertNode(Node head, int data, int pos){
        if(pos == 0){
            return insertNodeAtHead(head, data);
        }

        if(pos == -1){
            return insertNodeAtEnd(head, data);
        }

        return null;
    }

    public static Node insertNodeAtHead(Node head, int data){
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    public static Node insertNodeAtEnd(Node head, int data){
        Node temp = new Node(data);
        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = temp;

        return head;
    }
}
