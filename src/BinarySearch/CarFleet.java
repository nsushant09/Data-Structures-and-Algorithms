package BinarySearch;

import java.util.ArrayList;
import java.util.HashMap;

public class CarFleet {

    public static class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    public static void main(String[] args) {
        int target = 10;
        int[] position = new int[]{6, 8};
        int[] speed = new int[]{3, 2};
        System.out.println(carFleet(target, position, speed));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            list.add(new Pair(position[i], speed[i]));
        }
        sort(list);
        System.out.println(list);
        int left = 0;
        int right = left + 1;

        while (right < list.size()) {
            float leftTime = (target - list.get(left).key) / (float) list.get(left).value;
            float rightTime = (target - list.get(right).key) / (float) list.get(right).value;

            if (rightTime <= leftTime) {
                list.remove(right);
            } else {
                left++;
                right++;
            }
        }

        return list.size();
    }

    public static void sort(ArrayList<Pair> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).key < list.get(j).key) {
                    Pair temp_i = list.get(i);
                    Pair temp_j = list.get(j);
                    list.remove(i);
                    list.add(i, temp_j);
                    list.remove(j);
                    list.add(j, temp_i);
                }
            }
        }
    }
}
