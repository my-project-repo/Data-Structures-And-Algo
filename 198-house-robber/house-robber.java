class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];

        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i < dp.length; i++) {
            int take = nums[i - 1] + dp[i - 2];
            int not = dp[i - 1];

            dp[i] = Math.max(take, not);
        }

        return dp[nums.length];
    }
}