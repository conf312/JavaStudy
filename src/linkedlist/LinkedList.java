package linkedlist;

import java.util.Stack;

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
        n.append(2);
        n.append(1);
        n.append(1);

        System.out.print("n : ");
        n.retrieve();

        LinkedList n2 = new LinkedList();
        n2.append(1);
        n2.append(2);
        n2.append(3);
        n2.append(4);

        Node reverseNode = reverseAndClone(n.header);

        while(reverseNode.next != null) {
            System.out.print("reverseNode n -> " + reverseNode.data + " ");
            reverseNode = reverseNode.next;
        }

        System.out.println();
        String isEqual = isEqual(n.get(1), n2.get(1)) == true ? "isEqual" : "NotEqual";
        System.out.println("isEqual(n, n2) : " + isEqual);
        String isPalindrome = isPalindrome(n.get(1)) == true ? "isPalindrome" : "NotPalindrome";
        System.out.println("isPalindrome(n) : " + isPalindrome);
        System.out.println("findByDataToLast : " + findByDataToLast(n2.get(1), 1).data);
        System.out.println("findByNodeToLast : " + findByNodeToLast(n2.get(1), 3, new Reference()).data);
        System.out.println("factorial : " + factorial(5));
    }

    Node get(int index) {
        Node n = header;
        int count = 0;
        while(n != null) {
            if (count == index) {
                return n;
            }
            count++;
            n = n.next;
        }
        return null;
    }

    void append(int d) {
        Node n = header;
        Node node = new Node();
        node.data = d;

        while(n.next != null) {
            n = n.next;
        }

        n.next = node;
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
        int total = 0;

        while(n != null) {
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
        public int count = 0;
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
            return n * factorial(n - 1);
        }
    }

    static boolean isPalindrome(Node head) {
        Node reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    static Node reverseAndClone(Node node) {
        Node head = null;
        while(node != null) {
            Node n = new Node();
            n.data = node.data;
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    static boolean isEqual(Node n1, Node n2) {
        while (n1 != null && n2 != null) {
            if (n1.data != n2.data) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1 == null && n2 == null;
    }

    static int getLength(Node n) {
        int result = 0;
        while(n != null) {
            result++;
            n = n.next;
        }
        return result;
    }
}
