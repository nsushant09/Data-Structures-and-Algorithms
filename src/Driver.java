import array_and_hashing.ConcatenationOfArray;
import array_and_hashing.ContainsDuplicate;
import array_and_hashing.IsAnagram;
import array_and_hashing.TwoSum;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5};
        int target = 1;
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                System.out.println("Number in the list");
            }
        }

//        Array and Hashing Execution
        printArray(ConcatenationOfArray.getConcatenation(new int[]{1, 4, 1, 2}));
        System.out.println(ContainsDuplicate.hasDuplicate(new int[]{1, 2, 3, 3}));
        System.out.println(IsAnagram.isAnagram("racecar", "carrace"));
        printArray(TwoSum.twoSum(new int[]{1,3,4,2}, 6));
    }

    public static <T> void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(char[] array) {
        System.out.println(Arrays.toString(array));
    }
}
