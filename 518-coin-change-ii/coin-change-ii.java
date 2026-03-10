class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int[] d : dp)
            Arrays.fill(d, -1);
        return rec(0, coins, amount, dp);
    }

    int rec(int idx, int[] arr, int target, int[][] dp) {
        if (target == 0)
            return 1;
        if (idx >= arr.length)
            return 0;
        if (dp[idx][target] != -1)
            return dp[idx][target];
        if (arr[idx] > target)
            return rec(idx + 1, arr, target, dp);
        int includeAgain = rec(idx, arr, target - arr[idx], dp);
        int exclude = rec(idx + 1, arr, target, dp);
        return dp[idx][target] = includeAgain + exclude;

    }

}