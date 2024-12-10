public class ContainerWithMostWater {
    public static void main(String[] args) {  
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;

        while(left < right) {
            int area;
            if (height[left] < height[right]) {
                area = (right - left) * height[left];
                left+=1;
            } else {
                area = (right - left) * height[right];
                right-=1;
            }
        
            if (result <= area) result = area;
        }
        return result;
    }
}