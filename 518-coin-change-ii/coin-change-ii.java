class Solution {
    public int change(int amount, int[] coins) {
        int dp [][] = new int[coins.length+1][amount+1];
        for (int [] d : dp) Arrays.fill(d,-1);
        return knap(0,coins,amount,dp);
    }
    int knap (int i , int [] coins , int amount , int [][] dp)
    {
        if (amount == 0) return 1;
        else if (i >= coins.length) return 0;
        else if (dp[i][amount] != -1) return dp[i][amount];
        else if (coins[i] <= amount)
        {
            return dp[i][amount] = knap(i,coins,amount-coins[i],dp) + 
            knap(i+1,coins,amount,dp);

        } else
        return dp[i][amount] = knap(i+1,coins,amount,dp);
    }
}