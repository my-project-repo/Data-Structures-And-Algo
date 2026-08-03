class Solution {
    Integer[][] dp;

    public int numDistinct(String s, String t) {
        dp = new Integer[s.length()][t.length()];
        return sub(0, 0, s.toCharArray(), t.toCharArray());
    }

    int sub(int i, int j, char[] a, char[] b) {
        if (j == b.length)
            return 1;

        if (i == a.length)
            return 0;

        if (dp[i][j] != null)
            return dp[i][j];

        int ans = sub(i + 1, j, a, b);

        if (a[i] == b[j]) {
            ans += sub(i + 1, j + 1, a, b);
        }

        return dp[i][j] = ans;
    }
}