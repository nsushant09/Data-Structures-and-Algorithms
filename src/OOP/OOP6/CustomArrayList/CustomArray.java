package Kushwaha.OOP.OOP6.CustomArrayList;

import java.util.ArrayList;
import java.util.Arrays;


//this is only for integer type.
public class CustomArray {

    private int[] data;
    private final static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value.

    public CustomArray(int[] data) {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int [] temp = new int [data.length * 2];
        //copy the current items in the new array.
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
