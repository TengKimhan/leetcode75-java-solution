package hash_map_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[] { 1, 2,
                3 },
                new int[] { 2, 4, 6 }));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> result1 = new HashSet<>();
        Set<Integer> result2 = new HashSet<>();

        Set<Integer> setNums1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> setNums2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        for (int num : nums1) {
            if (!setNums2.contains(num))
                result1.add(num);
        }

        for (int num : nums2) {
            if (!setNums1.contains(num))
                result2.add(num);
        }

        result.add(new ArrayList<>(result1));
        result.add(new ArrayList<>(result2));
        return result;
    }

}
