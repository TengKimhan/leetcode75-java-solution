package array_string;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        ReverseVowelsOfAString reverser = new ReverseVowelsOfAString();

        assert reverser.reverseVowels("hello").equals("holle") : "Test case 1 failed";
        assert reverser.reverseVowels("leetcode").equals("leotcede") : "Test case 2 failed";

        System.out.println("All tests passed!");

    }

    public String reverseVowels(String s) {
        // convert string to char array
        char[] chars = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!isVowel(chars[start])) {
                start++;
                continue;
            }

            if (!isVowel(chars[end])) {
                end--;
                continue;
            }

            // swap the vowels
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        // convert char array to string
        return new String(chars);
    }

    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
