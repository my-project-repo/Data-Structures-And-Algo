class Solution {
    public int minInsertions(String s) {
        int n = s.length() , p = 0 , idx = 0 , edx = n-1;
        int [][] dp = new int [n+1][n+1];
        char [] a = new char[n];
        char [] b = new char[n];
        for (int i = 0;i<n;i++)
        {
            char ch = s.charAt(i);
            a[p] = ch;
            b[p] = ch;
            p++;
        }

        while (idx < edx)
        {
            char c = b[idx];
            b[idx] = b[edx];
            b[edx] = c;
            idx++; edx--;
        }

        for (int [] d : dp) Arrays.fill(d,-1);
        return n - lcs(0,0,a,b,dp);
    }

    int lcs(int i, int j, char[] a, char[] b, int[][] dp) {
        if (i >= a.length || j >= b.length)
            return 0;
        else if (dp[i][j] != -1)
            return dp[i][j];
        else if (a[i] == b[j]) {
            return dp[i][j] = 1 + lcs(i + 1, j + 1, a, b, dp);
        } else {
            return dp[i][j] = Math.max(lcs(i + 1, j, a, b, dp), lcs(i, j + 1, a, b, dp));
        }
    }
}