package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckInclusion {
    public static void main(String[] args) {
        System.out.println(checkInclusion("adc", "dcda"));

    }

    public static boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map1 = getMap(s1);
        System.out.println(map1);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int j = i + s1.length();
            HashMap<Character, Integer> map2 = getMap(s2.substring(i, j));
            System.out.println(map2);
            if (map1.equals(map2)) return true;
        }
        return false;
    }

    public static HashMap<Character, Integer> getMap(String s) {
        HashMap<Character, Integer> output = new HashMap<>();
        for (char c : s.toCharArray()) {
            int count = output.getOrDefault(c, 0);
            output.put(c, count + 1);
        }
        return output;
    }
}
