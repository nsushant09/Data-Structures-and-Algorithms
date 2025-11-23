import array_and_hashing.ConcatenationOfArray;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        printArray(ConcatenationOfArray.getConcatenation(new int[]{1, 4, 1, 2}));
        System.out.println(Arrays.toString(ConcatenationOfArray.getConcatenation(new int[]{1, 4, 1, 2})));
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
