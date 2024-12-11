package sliding_window;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        // write the assertion 
        MaxConsecutiveOnesIII m = new MaxConsecutiveOnesIII();
        int test1 = m.longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2);
        int test2 = m.longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3);
        assert test1 == 6 : "Test1 failed, expected 6 but got " + test1;
        assert test2 == 10 : "Test2 failed, expected 10 but got " + test2;

        System.out.println("All test passed");
    }

    public int longestOnes(int[] nums, int k) {
        int numsZero = 0;
        int maxWindow = Integer.MIN_VALUE;
        int left = 0;

        for (int right=0; right<nums.length; right++) {
            if (nums[right] == 0) numsZero++;
            while(numsZero > k) {
                if (nums[left] == 0) numsZero--;
                left++;
            }

            int currWindow = right - left + 1;
            if (maxWindow <= currWindow) maxWindow = currWindow;
        }
        return maxWindow;
    }
}