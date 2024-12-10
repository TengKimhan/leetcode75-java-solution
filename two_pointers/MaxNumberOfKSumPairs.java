import java.util.HashMap;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4}, 5));  
    }

    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        int pairs = 0;

        for (int num : nums) {
            if (dict.getOrDefault(k - num, 0) > 0) {
                pairs += 1;
                dict.put(k - num, dict.get(k - num) - 1);
            } else {
                dict.put(num, dict.getOrDefault(num, 0) + 1);
            }
        }

        return pairs;
    }
}
