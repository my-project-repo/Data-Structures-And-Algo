class Solution {
    Integer[][] dp;

    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE, n = matrix.length;
        dp = new Integer[n+1][n+1];
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, down(0, i, matrix));
        }
        return ans;
    }

    int down(int i, int j, int[][] mat) {
        if (i == mat.length - 1)
            return mat[i][j];
        if (dp[i][j] != null) return dp[i][j];
        int rd = Integer.MAX_VALUE, ld = Integer.MAX_VALUE;
        int d = mat[i][j] + down(i + 1, j, mat);
        if (j + 1 < mat.length)
            rd = mat[i][j] + down(i + 1, j + 1, mat);
        if (j - 1 >= 0)
            ld = mat[i][j] + down(i + 1, j - 1, mat);

        return dp[i][j] = Math.min(d, Math.min(rd, ld));

    }
}