package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[]{4, 7, 2, 5, 7, 1, 2, 8, 9, 12, 15, 45};
        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] arr) {
        if (arr.length == 1) return arr;
        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] output = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                output[k] = first[i];
                i++;
            } else {
                output[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            output[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            output[k] = second[j];
            j++;
            k++;
        }

        return output;
    }
}
