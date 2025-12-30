package BinarySearch;

import java.util.Arrays;

public class SearchMatrix {
    public static void main(String[] args) {
        int target = 13;
        int[][] arr = new int[][] {
                {1,2,4,8},
                {10,11,12,13},
                {14,20,30,40}
        };
        System.out.println(searchMatrix(arr, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int[] columnFirstValues = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            columnFirstValues[i] = matrix[i][0];
        }

        int columnIndex = columnFirstValues.length - 1;
        for (int i = 0; i < columnFirstValues.length - 1; i++) {
            if (target >= columnFirstValues[i] && target <= columnFirstValues[i + 1]) {
                columnIndex = i;
            }
        }

        for (int i = 0; i < matrix[columnIndex].length; i++) {
            if (matrix[columnIndex][i] == target) return true;
        }

        return false;
    }
}
