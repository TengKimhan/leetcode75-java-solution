package array_string;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf calculator = new ProductOfArrayExceptSelf();

        int[] testInput1 = { 1, 2, 3, 4 };
        int[] expectedOutput1 = { 24, 12, 8, 6 };
        assert java.util.Arrays.equals(calculator.productExceptSelf(testInput1), expectedOutput1)
                : "Test case 1 failed";

        int[] testInput2 = { -1, 1, 0, -3, 3 };
        int[] expectedOutput2 = { 0, 0, 9, 0, 0 };
        assert java.util.Arrays.equals(calculator.productExceptSelf(testInput2), expectedOutput2)
                : "Test case 2 failed";

        System.out.println("All test cases passed!");

    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int[] results = new int[n];
        prefix[0] = 1;
        postfix[n - 1] = 1;

        // prefix
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // postfix
        for (int i = n - 2; i >= 0; i--) {
            postfix[i] = postfix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            results[i] = prefix[i] * postfix[i];
        }
        return results;
    }
}
