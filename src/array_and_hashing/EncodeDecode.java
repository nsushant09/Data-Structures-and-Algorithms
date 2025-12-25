package array_and_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EncodeDecode {
    public static void main(String[] args) {
        String encoded = encode(List.of(new String[]{"neet", "code", "love", "you"}));
        System.out.println(encoded);
        List<String> decoded = decode(encoded);
        System.out.println(decoded);
    }


    public static String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        List<Integer> sizes = new ArrayList<>();
        for (String s : strs) {
            sizes.add(s.length());
        }
        StringBuilder output = new StringBuilder();
        for (int i : sizes) {
            output.append(i).append(",");
        }
        output.append("#");
        for (String str : strs) {
            output.append(str);
        }
        return output.toString();
    }

    public static List<String> decode(String str) {
        if (str.isEmpty()) return Collections.emptyList();
        ArrayList<Integer> sizes = new ArrayList<>();

        StringBuilder sizesBuilder = new StringBuilder();
        char[] c = str.toCharArray();
        int startIndex = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '#') {
                startIndex = i + 1;
                break;
            }
            if (c[i] == ',') {
                sizes.add(Integer.valueOf(sizesBuilder.toString()));
                sizesBuilder.delete(0, sizesBuilder.length());
            } else {
                sizesBuilder.append(c[i]);
            }
        }


        List<String> output = new ArrayList<>();
        for (int size : sizes) {
            output.add(str.substring(startIndex, startIndex + size));
            startIndex = startIndex + size;
        }

        return output;
    }
}
