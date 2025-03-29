class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for (int i : nums)
            max = Math.max(max, i);
        return max * k + (k * (k - 1) / 2);
    }
}