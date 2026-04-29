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
        for (int[] d : dp)
            Arrays.fill(d, -1);
        return lcs(0, 0, a, b, dp);

    }

    int lcs(int i, int j, char[] a, char[] b, int[][] dp) {
        if (i >= a.length || j >= b.length)
            return 0;
        else if (dp[i][j] != -1)
            return dp[i][j];
        else if (a[i] == b[j])
            return dp[i][j] = 1 + lcs(i + 1, j + 1, a, b, dp);
        else {
            return dp[i][j] = Math.max(lcs(i + 1, j, a, b, dp), lcs(i, j + 1, a, b, dp));
        }
    }
}