class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int i : nums) max = Math.max(max,i);
        int [] freq = new int [max+1];
        int [] dp = new int [max+1];
        for (int i : nums) freq[i] += i;
        Arrays.fill(dp,-1);
        return rob(0,freq,dp);
        
    }

    int rob (int i , int [] nums , int [] dp )
    {
        if (i >= nums.length) return 0;
        else if (dp[i] != -1) return dp[i];
        else {
            int add = nums[i] + rob(i+2,nums,dp);
            int skip = rob(i+1,nums,dp);
            return dp[i] = Math.max(add,skip);
        }
    }
}