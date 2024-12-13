package prefix_sum;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        FindTheHighestAltitude question = new FindTheHighestAltitude();
        int[] test1 = {-5,1,5,0,-7};
        int[] test2 = {-4,-3,-2,-1,4,3,2};
        int result1 = question.largestAltitude(test1);
        int result2 = question.largestAltitude(test2);

        assert result1 == 0 : "Test 1 fail. Expected 0 but got " + result1;
        assert result2 == 1 : "Test 2 fail. Expected 1 but got " + result2;
        
        System.out.println("All tests pass!");
        
    }

    public int largestAltitude(int[] gain) {
        int current = 0;
        int largest = 0;

        for (int i=0; i<gain.length; i++) {
            current = gain[i] + current;
            if (largest <= current) largest = current;
        }

        return largest;
    }
}
