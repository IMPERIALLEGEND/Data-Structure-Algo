class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

public class CreateDoublyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        head = insertNode(head, 25, 1);
        head = insertNode(head, 255, 3);
        head = insertNode(head, 30, 2);
        print(head);

        System.out.println("Delete Node");
        head = deletNode(head, -1);
        print(head);
        
        // head = reverse(head);
        // print(head);
    }

    public static Node insertNode(Node head, int data, int pos) {

        if (pos == 1) {
            Node temp = new Node(data);
            temp.next = head;
            head.prev = temp;
            head = temp;

            return head;
        } else {
            Node temp = new Node(data);
            if (head == null) {
                return temp;
            }
            if (head.next == null) {
                temp.next = head;
                head.prev = temp;
                head = temp;
                return head;
            }
            Node curr = head;
            int count = 1;
            while (count != pos) {
                curr = curr.next;
                if (curr == null) {
                    System.out.println("Out of Range");
                    return head;
                }
                count++;
            }

            curr.next = temp;
            temp.prev = curr;

            return head;
        }
    }

    private static Node reverse(Node head) {

        if (head == null || head.next == null)
            return head;

        Node curr = head;
        Node prev = null;
        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");

            temp = temp.next;
        }
        System.out.println();
    }

    public static Node deletNode(Node head, int pos){

        if(pos == 0){
            if(head == null || head.next == null){
                return null;
            }
            else{
                head = head.next;
                head.prev = null;
                return head;
            }
        }
        else if(pos == -1){
            if(head == null || head.next == null){
                return null;
            }
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.prev.next = null;
            curr.prev = null;

            return head;
        }
        return head;
    }
}
