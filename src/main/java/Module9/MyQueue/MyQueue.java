package Module9.MyQueue;


public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        Node<T> current = head;
        for (int i = 0; i < size - 1; i++) {
            current.next = null;
            current.prev = null;
        }
        size = 0;
    }

    public T peek() {
        return head.element;
    }

    public T pool() {
        T returnElem = head.element;
        head = head.next;
        (head.next).prev = null;
        size--;
        return returnElem;
    }

    static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(T element) {
            this.element = element;
        }
    }
}