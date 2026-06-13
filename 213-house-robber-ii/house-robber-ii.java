class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int n = nums.length;
        int[] dp = new int[n];
        int [] dp2 = new int [n];
        Arrays.fill(dp, -1);
        Arrays.fill(dp2,-1);
        return Math.max(rob(0, n - 2, nums, dp), rob(1, n - 1, nums, dp2));
    }

    int rob(int idx, int edx, int[] nums, int[] dp) {
        if (idx > edx)
            return 0;
        else if (dp[idx] != -1)
            return dp[idx];
        else {
            int include = nums[idx] + rob(idx + 2, edx, nums, dp);
            int exclude = rob(idx + 1, edx, nums, dp);
            return dp[idx] = Math.max(include, exclude);
        }
    }
}