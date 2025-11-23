package array_and_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> recorder = new HashSet<>();
        for (int num : nums) {
            if (recorder.contains(num)) {
                return true;
            } else {
                recorder.add(num);
            }
        }
        return false;
    }
}
