import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        TimeMap map = new TimeMap();
        map.set("key1", "value1", 10);
        System.out.println(map.get("key1", 1));
        System.out.println(map.get("key1", 10));
        System.out.println(map.get("key1", 11));
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
