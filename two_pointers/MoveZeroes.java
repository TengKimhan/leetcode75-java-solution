package two_pointers;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes mover = new MoveZeroes();

        int[] testInput1 = { 0, 1, 0, 3, 12 };
        mover.moveZeroes(testInput1);
        assert java.util.Arrays.equals(testInput1, new int[] { 1, 3, 12, 0, 0 }) : "Test case 1 failed";

        int[] testInput2 = { 0 };
        mover.moveZeroes(testInput2);
        assert java.util.Arrays.equals(testInput2, new int[] { 0 }) : "Test case 2 failed";

        System.out.println("All test cases passed!");
    }

    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int arrIndex = 0;
        for (int num : nums) {
            if (num != 0)
                arr[arrIndex++] = num;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

    }
}
