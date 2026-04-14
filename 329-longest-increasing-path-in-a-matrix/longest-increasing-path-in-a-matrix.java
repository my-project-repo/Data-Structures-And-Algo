class Solution {
    int[][] dp;

    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length , max = 0;
        dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max,dfs(i,j,matrix));
            }
        }
        return max;
    }

    int dfs(int i, int j, int[][] mat) {
        if (i >= mat.length || j >= mat[0].length || i < 0 || j < 0)
            return 0;

        if (dp[i][j] != 0)
            return dp[i][j];

        int total = 1;
        if (i < mat.length - 1 && mat[i][j] < mat[i + 1][j]) {
            total = Math.max(total, 1 + dfs(i + 1, j, mat));
        }

        if (j < mat[0].length - 1 && mat[i][j] < mat[i][j + 1]) {
            total = Math.max(total, 1 + dfs(i, j + 1, mat));
        }

        if (i > 0 && mat[i - 1][j] > mat[i][j]) {
            total = Math.max(total, 1 + dfs(i - 1, j, mat));
        }

        if (j > 0 && mat[i][j - 1] > mat[i][j]) {
            total = Math.max(total, 1 + dfs(i, j - 1, mat));
        }

        return dp[i][j] = total;

    }
}