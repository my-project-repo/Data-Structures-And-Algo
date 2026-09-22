class Solution {
    public boolean canSortArray(int[] nums) {
        int maxBefore = 0, max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            boolean change = Integer.bitCount(max) != Integer.bitCount(nums[i]);

            if (change) {
                maxBefore = max;
            }

            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < maxBefore)
                return false;
        }

        return true;
    }
}