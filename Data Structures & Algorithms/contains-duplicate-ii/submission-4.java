class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
       }
       return false;
    }
}