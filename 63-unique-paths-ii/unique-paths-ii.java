class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        int m = ob.length , n = ob[0].length;
        int [][] dp = new int[m][n];
        for (int [] a : dp) Arrays.fill(a,-1);
        return help(0,0,m,n,ob,dp);
    }
    int help (int i , int j , int m , int n , int [][] ob , int [][] dp)
    {
        if (i == m-1 && j == n-1 && ob[i][j] != 1) return 1;
        if (i >= m || j >= n) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        if (ob[i][j] == 1) return 0;

        int bottom = help(i+1,j,m,n,ob,dp);
        int right = help(i,j+1,m,n,ob,dp);
        return dp[i][j] = bottom + right;
    }
}