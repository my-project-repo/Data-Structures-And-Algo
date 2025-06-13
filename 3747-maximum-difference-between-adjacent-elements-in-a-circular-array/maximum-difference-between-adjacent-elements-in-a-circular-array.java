class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = -9999, n = nums.length;
        for (int i = 0; i <= n; i++) {
            max = Math.max(max, Math.abs(nums[i % n] - nums[(i + 1) % n]));
        }
        return max;
    }
}