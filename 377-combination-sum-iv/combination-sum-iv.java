class Solution {
    public int combinationSum4(int[] nums, int target) {
        int n = nums.length;
        int [][] dp = new int[n+1][target+1];
        for (int [] d : dp) Arrays.fill(d,-1);
        return knapsack(0,nums,target,dp);
    }
    int knapsack (int idx , int [] arr , int target , int [][] dp)
    {
        if (target == 0) return 1;
        if (target < 0 || idx >= arr.length) return 0;
        if (dp[idx][target] != -1) return dp[idx][target];
        int val = 0;
        for (int i = 0;i<arr.length;i++)
        {
            val += knapsack(i,arr,target-arr[i],dp);
        }
        return dp[idx][target] = val;
    }
}