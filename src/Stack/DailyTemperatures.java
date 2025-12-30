package Stack;


import java.util.Arrays;
import java.util.Stack;


public class DailyTemperatures {

    public static class Pair<K, V> {

        private final K key;
        private final V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 38, 30, 36, 35, 40, 28})));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Stack<Pair<Integer, Integer>> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int currentTemp = temperatures[i];

            while (!stack.isEmpty() && stack.peek().getKey() < currentTemp) {
                int index = stack.peek().getValue();
                output[index] = i - index;
                stack.pop();
            }

            stack.push(new Pair<>(currentTemp, i));
        }

        return output;
    }
}
