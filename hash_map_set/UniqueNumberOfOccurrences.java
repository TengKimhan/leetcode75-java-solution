package hash_map_set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));
        System.out.println(uniqueOccurrences(new int[] { 1, 2 }));
        System.out.println(uniqueOccurrences(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 }));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        // create a dictionary that map key is the number in array and value is the
        // occurrence of the number
        Map<Integer, Integer> map = new HashMap<>();

        // create a set that store the occurrence of the number which is the valued in
        // the dictionary
        Set<Integer> set = new HashSet<>();

        // Loop through array and count the occurrence of the number in the array (key)
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        // Loop through the dictionary and check if the occurrence of the number is
        // unique
        for (int occurrence : map.values()) {
            if (set.contains(occurrence))
                return false;
            else
                set.add(occurrence);
        }
        return true;
    }
}
