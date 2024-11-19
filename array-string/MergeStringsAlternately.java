/* Problem Statement
    You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

    Return the merged string.
*/

class MergeStringsAlternately {
    public static void main(String[] args) {
        MergeStringsAlternately solution = new MergeStringsAlternately();

        String result1 = solution.mergeAlternately("abc", "pqr");
        assert "apbqcr".equals(result1) : "Test case 1 failed";

        String result2 = solution.mergeAlternately("ab", "pqrs");
        assert "apbqrs".equals(result2) : "Test case 2 failed";

        String result3 = solution.mergeAlternately("abcd", "pq");
        assert "apbqcd".equals(result3) : "Test case 3 failed";

        System.out.println("All test cases passed!");

    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergeStr = new StringBuilder();

        int word1Length = word1.length();
        int word2Length = word2.length();

        if (word1Length == word2Length) {
            for (int i = 0; i < word2Length; i++) {
                mergeStr.append(word1.charAt(i));
                mergeStr.append(word2.charAt(i));
            }
        } else if (word2Length < word1Length) {
            for (int i = 0; i < word2Length; i++) {
                mergeStr.append(word1.charAt(i));
                mergeStr.append(word2.charAt(i));
            }
            mergeStr.append(word1.substring(word2Length));
        } else {
            for (int i = 0; i < word1Length; i++) {
                mergeStr.append(word1.charAt(i));
                mergeStr.append(word2.charAt(i));
            }
            mergeStr.append(word2.substring(word1Length));
        }

        return mergeStr.toString();
    }
}