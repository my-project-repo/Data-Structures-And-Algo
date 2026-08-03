class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length(), n = s2.length(), first = 0, second = 0;
        for (int i = 0; i < m; i++) {
            first += s1.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            second += s2.charAt(i);
        }

        if (first == second)
            return 0;

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = s1.charAt(i - 1) + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return first + second - 2 * dp[m][n];
    }
}