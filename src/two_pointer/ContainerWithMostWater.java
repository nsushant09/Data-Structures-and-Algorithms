package two_pointer;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,7,2,5,4,7,3,6}));
    }

    public static int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int max = 0;

        while (start < end) {
            int distance = end - start;
            int minHeight = Math.min(heights[start], heights[end]);
            int totalStorage = minHeight * distance;
            if (totalStorage > max) max = totalStorage;

            if (heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }
        }

        return max;
    }
}
