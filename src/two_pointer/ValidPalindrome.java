package two_pointer;

import java.util.ArrayList;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
    }

    public static boolean isPalindrome(String s) {
        ArrayList<Character> chars = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) chars.add(Character.toLowerCase(c));
        }

        System.out.println(chars);
        int charSize = chars.size();
        System.out.println(charSize);
        for (int i = 0; i < charSize / 2; i++) {
            if (chars.get(i) != chars.get(charSize - i - 1)) return false;
        }
        return true;
    }
}
