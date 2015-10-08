package org.meltwater.java.dataStructures;

public class BetterArray<E> {
 
 
 

    private static final int DEFAULT_SIZE = 10;
    private E[] array; 
    private int size = 0; 

 
    public BetterArray() {
        array = (E[]) new Object[DEFAULT_SIZE];
    }

 


 
    private void resize(int capacity) {
        assert capacity >= size;
        E[] temp = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++)
            temp[i] = array[i];
        array = temp;
    }

 
    public void add(E element) {
        if (size == array.length) resize(2 * array.length); 
        array[size++] = element; 
    }
 

 
 
    public E get(int index) {
        if (index > size) {
            throw new RuntimeException("Invalid index");
        }
        E element = (E) array[index];
        return element;
    }

 
 
    public int size() {
        return size;
    }

 
 
    public boolean isEmpty() {
        return size == 0;
    }

 
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new RuntimeException("Invalid index");
        }
        E element = (E) array[index];
        --size;
        System.arraycopy(array, index + 1, array, index, size - index);
        array[size] = null;
        return element;
    }

 
 
 
    public void dispString() {
 
 
 
 
    }
}
