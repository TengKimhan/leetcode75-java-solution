package hash_map_set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][] { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } }));
        System.out.println(equalPairs(new int[][] { {3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2} }));
        // System.out.println(equalPairs(new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1,
        // 1 } }));
        // System.out.println(equalPairs(new int[][] { { 1, 2, 1 }, { 2, 1, 2 }, { 1, 2,
        // 1 } }));
    }

    // Solution 2: O(n^2)
    public static int equalPairs(int[][] grid) {
        // create a dictionary to store the frequency of row as a string
        Map<String, Integer> map = new HashMap<>();
        int n = grid.length;
        int count = 0;

        // Iterate through the grid and store the frequency of each row
        for (int[] row : grid) map.put(Arrays.toString(row), map.getOrDefault(Arrays.toString(row), 0) + 1);

        // Iterate through the column of the grid and check the string of column equal to the row
        for (int col=0; col < n; col++) {
            int[] colArr = new int[n];

            for (int row=0; row < n; row++) colArr[row] = grid[row][col];
            count += map.getOrDefault(Arrays.toString(colArr), 0);
        }       
        

        return count;
    }

    // Solution 1: O(n^3)
    /* 
    public static int equalPairs(int[][] grid) {
        boolean isEqual = false;
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                for (int i = 0; i < grid.length; i++) {
                    if (grid[row][i] == grid[i][col])
                        isEqual = true;
                    else {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    count++;
                }
            }
        }

        return count;
    }
    */

}
