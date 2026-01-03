package BinarySearch;

import java.util.Arrays;

public class MinInRotatedArray {
    public static void main(String[] args) {
        System.out.println(findMinB(new int[]{4, 5, 0, 1, 2, 3}));
    }

    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
        }
        return min;
    }

    public static int findMinB(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}
