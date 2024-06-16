package Module9.MyArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    protected int size = 0;
    public static final int DEFAULT_SIZE = 10;
    private final E[] array = (E[]) new Object[DEFAULT_SIZE];


    public void add(E value) {
        if (size >= DEFAULT_SIZE){
            throw new ArrayIndexOutOfBoundsException();
        }
        array[size] = value;
        size++;


    }

    public void remove(int index) {
        if (index >= array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        for(int i = index; i < size-1; i++){
            array[i] = array[i+1];
        }
        size--;
    }

    public void clear() {
        Arrays.fill(array, null);
        size = 0;

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
