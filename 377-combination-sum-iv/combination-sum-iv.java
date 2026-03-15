class Solution {
    public int combinationSum4(int[] nums, int target) {
        int n = nums.length;
        Integer [] dp = new Integer[target+1];
        return knapsack(0,nums,target,dp);
    }
    int knapsack (int idx , int [] arr , int target , Integer [] dp)
    {
        if (target == 0) return 1;
        if (target < 0 || idx >= arr.length) return 0;
        if (dp[target] != null) return (int) dp[target];
        int val = 0;
        for (int i = 0;i<arr.length;i++)
        {
            val += knapsack(i,arr,target-arr[i],dp);
        }
        return dp[target] = val;
    }
}