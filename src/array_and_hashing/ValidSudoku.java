package array_and_hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        HashSet<Integer> test = new HashSet<>();
        test.add(1);
        System.out.println(test.add(1));
        System.out.println(test.add(2));
    }

    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            char[] row = board[i];
            ArrayList<Integer> rowInts = charToInt(row);
            if (containsDuplicate(rowInts)) return false;

        }

        for (int i = 0; i < 9; i++) {
            char[] column = new char[9];
            for (int j = 0; j < 9; j++) {
                column[j] = board[j][i];
            }
            ArrayList<Integer> columnInts = charToInt(column);
            if (containsDuplicate(columnInts)) return false;
        }

        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                ArrayList<Integer> subbox = subbox(board, i, j);
                if (containsDuplicate(subbox)) return false;
            }
        }

        return true;
    }

    public static boolean containsDuplicate(ArrayList<Integer> nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> charToInt(char[] chars) {
        ArrayList<Integer> output = new ArrayList<>();
        for (char c : chars) {
            if (c == '.') continue;
            output.add(c - '0');
        }
        return output;
    }

    public static ArrayList<Integer> subbox(char[][] board, int rowStart, int colStart) {
        int count = 0;
        char[] chars = new char[9];
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                chars[count] = board[i][j];
                count++;
            }
        }


        return charToInt(chars);
    }
}
