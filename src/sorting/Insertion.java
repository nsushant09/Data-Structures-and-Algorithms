package sorting;

import java.util.Arrays;

import static sorting.SelectionSort.swap;

public class Insertion {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 4, 2};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] > array[j - 1]) break;
                else {
                    swap(array, j, j - 1);
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
