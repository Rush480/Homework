package Module9.MyLinkedList;


import java.util.NoSuchElementException;

public class MyLinkedList<T> {
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

    private void removeFirst() {
        head = head.next;
        (head.next).prev = null;
        size--;
    }

    private void removeLast() {
        Node<T> current = tail;
        (current.prev).next = null;
        size--;
    }

    public void remove(int index) {
        if (index > size - 1 || index < 0) {
            throw new NoSuchElementException();
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();

        } else {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            (current.prev).next = current.next;
            (current.next).prev = current.prev;
            size--;
        }
    }


//     метод для виводу усіх елементів колекції в консоль
//    public void info() {
//        for (int i = 0; i < size; i++) {
//            System.out.println(get(i));
//        }
//    }

    public T get(int index) {
        if (index > size - 1 || index < 0) {
            throw new NoSuchElementException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
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
