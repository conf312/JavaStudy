package linkedlist;

public class LinkedList {

    /**
     * header를 만들어서 관리하는 이유
     * 기존의 Node에서는 첫번째 Node의 값을 지울수 없었다.
     */
    Node header;

    static class Node {
        int data;
        Node next = null;
    }

    public LinkedList() {
        header = new Node();
    }

    public static void main(String[] args) {
        LinkedList n = new LinkedList();
        n.append(1);
        n.append(2);
        n.append(3);
        n.append(4);
        n.append(5);
        n.retrieve();
        n.delete(5);
        n.retrieve();

        System.out.println("findByDataToLast : " + findByDataToLast(n.header,2).data);
        System.out.println("findByNodeToLast : " + findByNodeToLast(n.header, 2, new Reference()).data);
        System.out.println("factorial : " + factorial(5));
    }

    void append(int d) {
        Node endNode = new Node();
        endNode.data = d;
        Node n = header;

        while(n.next != null) {
            n = n.next;
        }

        n.next = endNode;
    }

    void delete(int d) {
        Node n = header;
        while(n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                break;
            }
            n = n.next;
        }
    }

    void retrieve() {
        Node n = header.next;
        while(n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    void removeDups() {
        Node n = header;
        while (n != null && n.next != null) {
            Node r = n;
            while(r.next != null) {
                if (n.data == r.next.data) {
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
            n = n.next;
        }
    }

    static Node findByDataToLast(Node target, int k) {
        Node n = target;
        int total = 1;

        while(n.next != null) {
            total++;
            n = n.next;
        }

        n = target;

        for (int i = 1; i < (total - k) + 1; i++) {
            n = n.next;
        }

        return n;
    }

    static class Reference {
        public int count = 0 ;
    }

    /**
     재귀 함수를 이용해서 Node의 뒤에서 n번째 노드를 리턴한다.
     */
    static Node findByNodeToLast(Node target, int k, Reference r) {
        if (target == null) {
            return null;
        }

        Node found = findByNodeToLast(target.next, k, r);
        r.count++;

        if (r.count == k) {
            return target;
        }

        return found;
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }


}
