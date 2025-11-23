import array_and_hashing.ConcatenationOfArray;
import array_and_hashing.ContainsDuplicate;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        printArray(ConcatenationOfArray.getConcatenation(new int[]{1, 4, 1, 2}));
        System.out.println(ContainsDuplicate.hasDuplicate(new int[]{1, 2, 3, 3}));
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
