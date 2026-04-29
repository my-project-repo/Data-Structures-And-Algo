class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] a = s.toCharArray();
        char[] b = s.toCharArray();
        int idx = 0, edx = b.length - 1;
        int[][] dp = new int[a.length + 1][b.length + 1];
        while (idx < edx) {
            char c = b[idx];
            b[idx] = b[edx];
            b[edx] = c;
            idx++;
            edx--;
        }

        //dp

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (a[i - 1] == b[j - 1])
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[a.length][a.length];
    }
}