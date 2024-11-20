package array_string;

public class CanPlaceFlower {
    public static void main(String[] args) {
        CanPlaceFlower solution = new CanPlaceFlower();

        assert solution.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 1) == true : "Test case 1 failed";
        assert solution.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2) == false : "Test case 2 failed";

        System.out.println("All tests passed!");
    }

    public boolean canPlaceFlowers(int[] garden, int numFlowers) {
        int numberCanPlantFlower = 0;
        int i = 0;

        if (numFlowers == 0)
            return true;

        while (i < garden.length) {
            if (garden[i] == 0 &&
                    (garden[i - 1] == 0 || i == 0) &&
                    (garden[i + 1] == 0 || i == garden.length - 1)) {
                garden[i] = 1;
                i += 2;
                numberCanPlantFlower++;
            }
        }
        return numberCanPlantFlower >= numFlowers;
    }
}
