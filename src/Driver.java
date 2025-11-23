import array_and_hashing.ConcatenationOfArray;
import array_and_hashing.ContainsDuplicate;
import array_and_hashing.IsAnagram;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {

//        Array and Hashing Execution
        printArray(ConcatenationOfArray.getConcatenation(new int[]{1, 4, 1, 2}));
        System.out.println(ContainsDuplicate.hasDuplicate(new int[]{1, 2, 3, 3}));
        System.out.println(IsAnagram.isAnagram("racecar", "carrace"));
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
