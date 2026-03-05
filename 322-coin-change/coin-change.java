class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int[] a : dp)
            Arrays.fill(a, -1);
            int res = minDif(0, amount, coins, dp);
        return res == Integer.MAX_VALUE ? -1 : res ;
    }

    int minDif(int idx, int left, int[] arr, int[][] dp) {
        if (left == 0 ) return 0;
        if (idx == arr.length) {
            return left == 0 ? 0 : Integer.MAX_VALUE;
        }
        if (arr[idx] > left)
            return minDif(idx + 1, left, arr, dp);
        if (dp[idx][left] != -1)
            return dp[idx][left];
        int include = minDif(idx, left - arr[idx], arr, dp);
        if (include != Integer.MAX_VALUE)
            include += 1;
        int exclude = minDif(idx + 1, left, arr, dp);
        return dp[idx][left] = Math.min(include, exclude);
    }
}