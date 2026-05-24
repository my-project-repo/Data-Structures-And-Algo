class Solution {
    public int rob(int[] nums) {
        int [] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return help(0,nums,dp);
    }

    int help (int i , int [] nums , int [] dp)
    {
        if (i >= nums.length) return 0;
        else if (dp[i] != -1) return dp[i];
        else
        {
            int take = nums[i] + help(i+2,nums,dp);
            int skip = help(i+1,nums,dp);
            return dp[i] = Math.max(take,skip);
        }
    }
}