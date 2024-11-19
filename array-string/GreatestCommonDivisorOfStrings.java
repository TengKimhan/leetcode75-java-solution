/*
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();

        assert solution.gcdOfStrings("ABCABC", "ABC").equals("ABC") : "Test case 1 failed";
        assert solution.gcdOfStrings("ABABAB", "ABAB").equals("AB") : "Test case 2 failed";
        assert solution.gcdOfStrings("LEET", "CODE").equals("") : "Test case 3 failed";

        System.out.println("All tests passed!");

    }

    public String gcdOfStrings(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();

        if (!(str1 + str2).equals(str2 + str1))
            return "";
        return str1.substring(0, gcd(str1Length, str2Length));
    }

    public int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
