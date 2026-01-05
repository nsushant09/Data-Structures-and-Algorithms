import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
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
