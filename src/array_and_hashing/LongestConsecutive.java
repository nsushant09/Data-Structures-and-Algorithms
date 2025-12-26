package array_and_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutive {

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{}));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        ArrayList<Integer> starts = new ArrayList<>();
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                starts.add(num);
            }
        }

        System.out.println(starts);

        int maxSequence = 0;
        int currentSequence = 1;
        int index = 0;
        while (index < starts.size()) {
            if (set.contains(starts.get(index) + currentSequence)) {
                currentSequence++;
            } else {
                if (currentSequence > maxSequence) maxSequence = currentSequence;
                currentSequence = 1;
                index++;
            }
        }

        return maxSequence;
    }
}
