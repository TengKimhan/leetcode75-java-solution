package sliding_window;

public class LongestSubArrayOfOneAfterDeletingOne {
    public static void main(String[] args) {
        int test1 = longestSubarray(new int[] { 1, 1, 0, 1 });
        int test2 = longestSubarray(new int[] { 0, 1, 1, 1, 0, 1, 1, 0, 1 });
        int test3 = longestSubarray(new int[] { 1, 1, 1 });
        assert test1 == 3 : "Test 1 Failed Expected 3 but got " + test1;
        assert test2 == 5 : "Test 2 Failed Expected 5 but got " + test2;
        assert test3 == 2 : "Test 3 Failed Expected 2 but got " + test3;

        System.out.println("All tests passed");

    }

    public static int longestSubarray(int[] nums) {
        int left = 0;
        int longest = Integer.MIN_VALUE;
        int numsZero = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                numsZero++;

                // if number of zero is greater than 1 then adjust window by move left
                while (numsZero > 1) {
                    if (nums[left] == 0)
                        numsZero--;
                    left++;
                }
            }

            int curr = right - left;
            if (longest <= curr)
                longest = curr;
        }
        return longest;
    }
}
