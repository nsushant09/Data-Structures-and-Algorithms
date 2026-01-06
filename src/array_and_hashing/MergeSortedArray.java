package array_and_hashing;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        nums1 = mergeSort(nums1);
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;
        int mid = array.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));

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
