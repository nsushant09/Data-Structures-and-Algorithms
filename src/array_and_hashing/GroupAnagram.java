package array_and_hashing;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"", ""}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> hm = new HashMap<>();

        for (String item : strs) {
            char[] characters = item.toCharArray();
            HashMap<Character, Integer> key = new HashMap<>();

            for (char c : characters) {
                key.put(c, key.getOrDefault(c, -1) + 1);
            }

            if (hm.containsKey(key)) {
                List<String> prevList = hm.get(key);
                prevList.add(item);
                hm.put(key, prevList);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(item);
                hm.put(key, newList);
            }
        }

        return hm.values().stream().toList();
    }
}
