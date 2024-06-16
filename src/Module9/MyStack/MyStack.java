package Module9.MyStack;

import java.util.Arrays;

public class MyStack<E> {
    protected int size = 0;
    public static final int DEFAULT_SIZE = 10;
    private final E[] array = (E[]) new Object[DEFAULT_SIZE];

    public void push(E value) {
        if (size >= DEFAULT_SIZE) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index >= array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void clear() {
        Arrays.fill(array, null);
        size = 0;
    }

    public int size() {
        //System.out.println("Size of list is " + size);
        return size;
    }

    public E pop() {
        E returnValue = array[size - 1];
        remove(size - 1);
        return returnValue;
    }

    public E peek() {
        return array[size - 1];
    }
}