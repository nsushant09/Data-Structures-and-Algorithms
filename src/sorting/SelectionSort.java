package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 4, 2};
        selection(array);
        System.out.println(Arrays.toString(array));
    }

    static void selection(int[] array){
        for (int i = 0; i < array.length; i++) {
            int last = array.length - i - 1;
            int maxIndex = getMaxIndex(array, 0, last);
            swap(array, last, maxIndex);
        }
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
