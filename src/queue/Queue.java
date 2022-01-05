package queue;

import java.util.NoSuchElementException;

public class Queue<E> {

    class Node<E> {
        E data;
        Node<E> next;
        public Node(E data) {
            this.data = data;
        }
    }

    private Node<E> element;

    public E add(E item) {
        Node<E> node = new Node<E>(item);
        if (element == null)
            element = node;
        element.next = node;
        return node.data;
    }

    public E remove() {
        if (element == null)
            throw new NoSuchElementException();
        E item = element.data;
        element = element.next;
        return item;
    }

    public E peek() {
        if (element == null)
            throw new NoSuchElementException();
        return element.data;
    }

    public boolean isEmpty() {
        return element == null;
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
        queue.add("A");
        queue.add("B");
        System.out.println("queue.peek() : " + queue.remove());
        System.out.println("queue.isEmpty() : " + queue.isEmpty());
        System.out.println("queue.peek() : " + queue.remove());
        System.out.println("queue.isEmpty() : " + queue.isEmpty());
    }
}
