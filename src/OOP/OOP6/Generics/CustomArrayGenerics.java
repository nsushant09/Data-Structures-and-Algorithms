package Kushwaha.OOP.OOP6.Generics;

import java.util.Arrays;


//this is only for integer type.
public class CustomArrayGenerics<T> {

    private Object[] data;
    private final static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value.

    public CustomArrayGenerics() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
         Object[] temp = new Object[data.length * 2];
        //copy the current items in the new array.
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayGenerics<Integer> list = new CustomArrayGenerics<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
