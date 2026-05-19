class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length + 1];
        Arrays.fill(dp, -1);
        return partition(0, arr, k, dp);
    }

    int partition(int i, int[] arr, int k, int[] dp) {
        if (i >= arr.length)
            return 0;
        if (dp[i] != -1)
            return dp[i];
        int ans = 0;
        int max = -1;
        for (int j = i; j < arr.length && j - i + 1 <= k; j++) {
            max = Math.max(max, arr[j]);
            ans = Math.max(ans, max * (j - i + 1) + partition(j + 1, arr, k,dp));
        }

        return dp[i] = ans;
    }
}