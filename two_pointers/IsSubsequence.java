package two_pointers;

public class IsSubsequence {
    public static void main(String[] args) {
        IsSubsequence checker = new IsSubsequence();

        assert checker.isSubsequence("abc", "ahbgdc") : "Test case 1 failed";
        assert !checker.isSubsequence("axc", "ahbgdc") : "Test case 2 failed";

        System.out.println("All test cases passed!");

    }

    public boolean isSubsequence(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        int i = 0;
        int j = 0;
        if (sArr.length == 0)
            return true;

        while (i < tArr.length) {
            if (tArr[i] == sArr[j]) {
                j++;
                if (j == sArr.length)
                    return true;
            }
            i++;
        }
        return false;
    }
}
