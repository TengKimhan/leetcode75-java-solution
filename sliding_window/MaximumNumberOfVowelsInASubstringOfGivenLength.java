package sliding_window;

import java.util.Arrays;
import java.util.HashSet;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        System.out.println(maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33));

    }

    public static int maxVowels(String s, int k) {
        int countVowel = 0;
        int maxVowel = Integer.MIN_VALUE;
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        // loop through the first window
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i)))
                countVowel += 1;
            maxVowel = countVowel;
        }

        // loop to the next window
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i)))
                countVowel += 1;
            if (vowels.contains(s.charAt(i - k)))
                countVowel -= 1;
            if (maxVowel < countVowel)
                maxVowel = countVowel;
        }

        return maxVowel;
    }
}
