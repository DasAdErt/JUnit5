package first_task;

import java.util.Arrays;
import java.util.List;

public class ReverseAndReplaceVowels {
    public static String reverseAndReplaceVowels(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (vowels.contains(Character.toLowerCase(c))) {
                sb.append(Character.toLowerCase(vowels.indexOf(Character.toLowerCase(c)) + 1));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
