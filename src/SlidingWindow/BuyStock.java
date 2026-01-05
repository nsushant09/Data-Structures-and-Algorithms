package SlidingWindow;

import java.util.Arrays;

public class BuyStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{10, 8, 7, 5, 2}));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;

        int left = 0;
        int right = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }

        return profit;
    }
}
