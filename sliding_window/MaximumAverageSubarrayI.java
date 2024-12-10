package sliding_window;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        MaximumAverageSubarrayI calculator = new MaximumAverageSubarrayI();

        assert Math.abs(calculator.findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4) - 12.75) < 1e-5
                : "Test case 1 failed";
        assert Math.abs(calculator.findMaxAverage(new int[] { 5 }, 1) - 5.0) < 1e-5 : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }

    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        int sum = 0;

        // Sum through the first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            double avg = (double) sum / k;
            maxAvg = avg;
        }

        // Slide window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            double avg = (double) sum / k;
            if (maxAvg < avg)
                maxAvg = avg;
        }

        return maxAvg;
    }

}
