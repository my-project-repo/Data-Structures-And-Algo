class Solution {
    public int minInsertions(String s) {
        int n = s.length() , p = 0 , idx = 0 , edx = n-1;
        int [][] dp = new int [n+1][n+1];
        char [] a = new char[n];
        char [] b = new char[n];
        for (char ch : s.toCharArray())
        {
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

        // dp
        for (int i = 1;i<=n;i++)
        {
            for (int j = 1;j<=n;j++)
            {
                if (a[i-1] == b[j-1])
                dp[i][j] = 1 + dp[i-1][j-1];
                else
                dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return n - dp[n][n];
    }
}