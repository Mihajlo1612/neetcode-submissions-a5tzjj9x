class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (left < right) {
            int curr = Math.min(height[left], height[right]) * (right - left);
            if (curr > max)
                max = curr;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
