class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int n = nums.length, ans = 0;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        ans = rob(0, n - 2, nums, dp);
        Arrays.fill(dp, -1);
        ans = Math.max(ans, rob(1, n - 1, nums, dp));
        return ans;
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