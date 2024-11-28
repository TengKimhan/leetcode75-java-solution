package array_string;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        IncreasingTripletSubsequence checker = new IncreasingTripletSubsequence();

        int[] testInput1 = { 1, 2, 3, 4, 5 };
        assert checker.increasingTriplet(testInput1) == true : "Test case 1 failed";

        int[] testInput2 = { 5, 4, 3, 2, 1 };
        assert checker.increasingTriplet(testInput2) == false : "Test case 2 failed";

        int[] testInput3 = { 2, 1, 5, 0, 4, 6 };
        assert checker.increasingTriplet(testInput3) == true : "Test case 3 failed";

        System.out.println("All test cases passed!");
    }

    public boolean increasingTriplet(int[] nums) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= firstMin)
                firstMin = nums[i];
            else if (nums[i] <= secondMin)
                secondMin = nums[i];
            else
                return true;
        }
        return false;
    }
}
