package array_and_hashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 4, 6};
        int[] output = productExceptSelf(input);
        System.out.println(Arrays.toString(output));
        int[] outputOpti = productExceptSelfOpti(input);
        System.out.println(Arrays.toString(outputOpti));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product = product * nums[j];
                }
            }
            output[i] = product;
        }
        return output;
    }

    public static int[] productExceptSelfOpti(int[] nums) {

        // Result array where final answers will be stored
        int[] output = new int[nums.length];

        // prefix[i] will store the product of all elements BEFORE index i
        int[] prefix = new int[nums.length];

        // suffix[i] will store the product of all elements AFTER index i
        int[] suffix = new int[nums.length];

        // There are no elements before index 0, so prefix[0] = 1 (neutral element of multiplication)
        prefix[0] = 1;

        // There are no elements after last index, so suffix[last] = 1
        suffix[nums.length - 1] = 1;

        // Build the prefix product array
        // prefix[i] = nums[0] * nums[1] * ... * nums[i-1]
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        // Build the suffix product array
        // suffix[i] = nums[i+1] * nums[i+2] * ... * nums[n-1]
        for (int i = suffix.length - 2; i >= 0; i--) {
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }

        // Final output:
        // product of all elements except nums[i]
        // = prefix[i] * suffix[i]
        for (int i = 0; i < output.length; i++) {
            output[i] = prefix[i] * suffix[i];
        }

        return output;
    }

}
