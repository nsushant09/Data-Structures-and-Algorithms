package two_pointer;

import java.util.Arrays;

public class TwoSumTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 3)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                return new int[]{start + 1, end + 1};
            }

            if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }


        return new int[]{0, 0};
    }
}
