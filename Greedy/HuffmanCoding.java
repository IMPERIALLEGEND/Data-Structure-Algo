import java.util.PriorityQueue;

class Node {
    char c;
    int freq;
    Node left;
    Node right;

    Node(char c, int freq, Node left, Node right) {
        this.c = c;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}

public class HuffmanCoding {

    public static void printCodes(Node t, String s){
        if(t.c != '$'){
            System.out.println(t.c+" "+s);
            return;
        }

        printCodes(t.left, s+'0');
        printCodes(t.right, s+'1');
    }

    public static void huffmanCoding(char[] ch, int[] chf, int n) {
        PriorityQueue<Node> pq = new PriorityQueue<>((Node n1, Node n2) -> n1.freq - n2.freq);
        for (int i = 0; i < n; i++) {
            pq.add(new Node(ch[i], chf[i], null, null));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            pq.add(new Node('$', left.freq + right.freq, left, right));
        }

        printCodes(pq.peek(), "");
        return;
    }

    public static void main(String[] args) {
        char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] chf = { 5, 9, 12, 13, 16, 45 };

        huffmanCoding(ch, chf, 6);
    }
}
