class Solution {
    public static int check(int[] nums, int n) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                counter++;
            }
        }
        return counter;
    }
    public int majorityElement(int[] nums) {
        int max = nums.length/2;

        for (int num : nums) {
            if (check(nums, num) > max) {
                return num;
            }
        }
        return 0;
    }
}