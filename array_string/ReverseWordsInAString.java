package array_string;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        ReverseWordsInAString reverser = new ReverseWordsInAString();

        assert reverser.reverseWords("the sky is blue").equals("blue is sky the") : "Test case 1 failed";
        assert reverser.reverseWords("  hello world  ").equals("world hello") : "Test case 2 failed";
        assert reverser.reverseWords("a good   example").equals("example good a") : "Test case 3 failed";

        System.out.println("All tests passed!");

    }

    public String reverseWords(String input) {
        String[] words = input.trim().split("\\s+");
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]);
            if (i != 0)
                reverseString.append(" ");
        }
        return reverseString.toString();
    }

}
