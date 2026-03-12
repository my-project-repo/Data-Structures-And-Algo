class Solution {
    public int change(int amount, int[] coins) {
        int [][] dp = new int[coins.length+1][amount+1];
        for (int [] d : dp) Arrays.fill(d,-1);
        return coin(0, coins, amount,dp);
    }

    int coin(int idx, int[] nums, int target, int[][] dp) {
        if (target == 0)
            return 1;
        if (idx >= nums.length)
            return 0;
        if (dp[idx][target] != -1)
            return dp[idx][target];
        if (nums[idx] > target)
            return coin(idx + 1, nums, target,dp);
        int include = coin(idx, nums, target - nums[idx],dp);
        int exclude = coin(idx + 1, nums, target,dp);
        return dp[idx][target] = include + exclude;
    }
}