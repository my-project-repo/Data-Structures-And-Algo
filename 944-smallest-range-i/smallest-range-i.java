class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int diff = (max - k) - (min + k);
        return diff < 0 ? 0 : diff;
    }
}