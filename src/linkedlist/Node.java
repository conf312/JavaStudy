package linkedlist;

public class Node {

    int data;
    Node next = null;

    public static void main(String[] args) {
        Node n = new Node(1);
        n.append(2);
        n.append(3);
        n.retrieve();
        n.delete(1);
        n.retrieve();
    }

    public Node(int data) {
        this.data = data;
    }

    void append(int d) {
        Node endNode = new Node(d);
        Node n = this;

        while(n.next != null) {
            n = n.next;
        }

        n.next = endNode;
    }

    void delete(int d) {
        Node n = this;
        while(n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                break;
            }
            n = n.next;
        }
    }

    void retrieve() {
        Node n = this;
        System.out.println("n : " + n);
        while(n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

}
