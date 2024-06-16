package Module9.MyArrayList;


import java.util.Arrays;

public class MyArrayList<E> {
    protected int size = 0;
    public static final int DEFAULT_SIZE = 10;
    private final E[] array = (E[]) new Object[DEFAULT_SIZE];


    //додаємо елемент у кінець
    public void add(E value) {

        array[size] = value;
        size++;
        //System.out.println(value + " -  added to the list");

    }

    // Видаляємо елемент за вказаним індексом
    public void remove(int index) {
        if (index >= array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        for(int i = index; i < size-1; i++){
            array[i] = array[i+1];
        }
        //System.out.println("Element on index " + index + " has been removed");
        size--;
    }

    // Очищаємо нашу колекцію
    public void clear() {
        Arrays.fill(array, 0);
        size = 0;
        System.out.println("Your list is cleared");
    }

    // Повертає розмір колекції
    public int size() {
        //System.out.println("Size of list is " + size);
        return size;
    }

    // Повертає елемент за індексом
    public E get(int index) {
        if (index >= array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        //System.out.println("Element on index " + index + " is " + array[index]);
        return array[index];
    }
}
