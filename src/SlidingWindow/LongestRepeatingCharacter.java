package SlidingWindow;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAA", 0));
    }

    public static int characterReplacement(String s, int k) {
        int left = 0;
        int right = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        while (right > left) {
            map = getMap(s.substring(left, right));
            if (map.size() == 1) return map.values().iterator().next();

            int min = getMin(map.values());
            if (min <= k) return right;

            right--;
        }

        return right;
    }

    public static HashMap<Character, Integer> getMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }

        return map;
    }

    public static int getMin(Collection<Integer> values) {
        final AtomicInteger min = new AtomicInteger(values.iterator().next());
        values.forEach(value -> {
            if (value < min.intValue()) {
                min.set(value);
            }
        });
        return min.get();
    }
}
