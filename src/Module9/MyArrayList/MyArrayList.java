package Module9.MyArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    protected int size = 0;
    public static final int DEFAULT_SIZE = 10;
    private E[] array = (E[]) new Object[DEFAULT_SIZE];

    private void resize(int newSize) {
        array = Arrays.copyOf(array, newSize);
    }

    public void add(E value) {
        if (size == array.length) {
            resize(array.length * 2);
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
        if (size > 0 && size == array.length / 4) {
            resize(array.length / 2);
        }
    }

    public void clear() {
        Arrays.fill(array, null);
        size = 0;
        resize(DEFAULT_SIZE);

    }

    public int size() {
        return size;
    }


    public E get(int index) {
        if (index >= array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }

        return array[index];
    }
}
