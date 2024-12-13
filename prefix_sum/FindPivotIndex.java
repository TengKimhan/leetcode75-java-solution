package prefix_sum;

public class FindPivotIndex {
    public static void main(String[] args) {
        int result1 = pivotIndex(new int[] {1,7,3,6,5,6});
        int result2 = pivotIndex(new int[] {1,2,3});
        int result3 = pivotIndex(new int[] {2,1,-1});

        assert result1 == 3 : "Test 1 fail. Expected 3 but got " + result1;
        assert result2 == -1 : "Test 2 fail. Expected -1 but got " + result2;
        assert result3 == 0 : "Test 3 fail. Expected 0 but got " + result3;
        
        System.out.println("All test pass");
    }

    public static int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int totalSum = 0;

        // find the sum of the array
        for (int i=0; i<nums.length; i++) totalSum+=nums[i];

        for (int i=0; i<nums.length; i++) {
            int sumRight = totalSum - nums[i] - sumLeft;
            if (sumRight == sumLeft) return i;
            sumLeft = sumLeft + nums[i];
        }
        return -1;
    }
}
