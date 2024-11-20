package array_string;

import java.util.ArrayList;
import java.util.List;

class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        KidsWithTheGreatestNumberOfCandies solution = new KidsWithTheGreatestNumberOfCandies();

        List<Boolean> result1 = solution.kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3);
        assert result1.equals(List.of(true, true, true, false, true)) : "Test case 1 failed";

        List<Boolean> result2 = solution.kidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1);
        assert result2.equals(List.of(true, false, false, false, false)) : "Test case 2 failed";

        List<Boolean> result3 = solution.kidsWithCandies(new int[] { 12, 1, 12 }, 10);
        assert result3.equals(List.of(true, false, true)) : "Test case 3 failed";

        System.out.println("All tests passed!");
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Initialize the result list
        List<Boolean> result = new ArrayList<>();

        // Find the max number of candies
        int maxCandy = 0;
        for (int candy : candies)
            maxCandy = Math.max(maxCandy, candy);

        for (int candy : candies) {
            if (candy + extraCandies >= maxCandy)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
