package SlidingWindow;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("xxxx"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;

        while (right < chars.length) {

            if (set.contains(chars[right])) {
                set.remove(chars[left]);
                left++;
                continue;
            } else {
                set.add(chars[right]);
                right++;
            }

            longest = Math.max(longest, set.size());

        }

        return longest;
    }

    public static int lengthOfLongestSubstringOld(String s) {
        int longest = 0;
        HashSet<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(chars[j])) break;
                else set.add(chars[j]);
            }
            longest = Math.max(longest, set.size());
        }

        return longest;
    }
}
