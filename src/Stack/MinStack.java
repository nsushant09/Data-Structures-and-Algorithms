package Stack;

import java.util.ArrayList;

class MinStack {

    ArrayList<Integer> list;

    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int val) {
        list.add(0, val);
    }

    public void pop() {
        list.remove(0);
    }

    public int top() {
        return list.get(0);
    }

    public int getMin() {
        int min = list.get(0);
        for (int num : list) {
            if (num < min) min = num;
        }
        return min;
    }
}