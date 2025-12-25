package array_and_hashing;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        topKFrequent(new int[]{7,7}, 1);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        List<List<Integer>> array = new ArrayList<>();
        for (int i = 0; i < nums.length + 1; i++) {
            array.add(new ArrayList<>());
        }

        for (int item : nums) {
            int itemCount = numCount.getOrDefault(item, 0) + 1;
            numCount.put(item, itemCount);
        }

        numCount.forEach((num, count) -> {
            List<Integer> prev = array.get(count);
            prev.add(num);
        });

        array.forEach(item -> {
            System.out.println(Arrays.toString(item.toArray()));
        });

        int count = 0;
        int[] output = new int[k];
        for (int i = array.size() - 1; i >= 0; i--) {
            if (count >= k) break;
            for (int j = 0; j < array.get(i).size(); j++) {
                output[count] = array.get(i).get(j);
                count++;
            }
        }

        System.out.println(Arrays.toString(output));


        return output;
    }
}
