class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length + 1];
        for (int a[] : dp)
            Arrays.fill(a, -1);
        return lis(0, -1, nums, dp);
    }

    int lis(int idx, int prev, int[] nums, int[][] dp) {
        if (idx == nums.length)
            return 0;
        else if (dp[idx][prev + 1] != -1)
            return dp[idx][prev + 1];

        int take = 0, skip = 0;
        if (prev == -1 || nums[idx] > nums[prev]) {
            take = 1 + lis(idx + 1, idx, nums, dp);
        }

        skip = lis(idx + 1, prev, nums, dp);

        return dp[idx][prev + 1] = Math.max(take, skip);

    }
}