class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int[][] dp = new int[jobDifficulty.length + 1][d + 1];
        for (int[] dd : dp)
            Arrays.fill(dd, -1);
        return min(0, d, jobDifficulty, dp);
    }

    int min(int idx, int k, int[] jobs, int[][] dp) {
        if (k == 1) {
            int max = Integer.MIN_VALUE;
            for (int i = idx; i < jobs.length; i++) {
                max = Math.max(max, jobs[i]);
            }
            return max;
        } else if (dp[idx][k] != -1)
            return dp[idx][k];
        else {
            int max = Integer.MIN_VALUE, ans = Integer.MAX_VALUE;
            for (int i = idx; i <= jobs.length - k; i++) {
                max = Math.max(max, jobs[i]);
                int part = min(i + 1, k - 1, jobs, dp);
                ans = Math.min(ans, max + part);
            }
            return dp[idx][k] = ans == Integer.MAX_VALUE ? -1 : ans;
        }
    }
}