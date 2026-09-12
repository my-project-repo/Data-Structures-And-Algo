class Solution {
    Integer[][] dp;

    public int maximalSquare(char[][] matrix) {
        int ans = 0, m = matrix.length, n = matrix[0].length;
        dp = new Integer[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    ans = Math.max(ans, dfs(i, j, matrix));
                }
            }
        }

        return ans * ans;
    }

    int dfs(int r, int c, char[][] M) {
        if (r >= M.length || c >= M[0].length || M[r][c] == '0')
            return 0;
        if (dp[r][c] != null)
            return dp[r][c];
        int down = 1 + dfs(r + 1, c, M);
        int right = 1 + dfs(r, c + 1, M);
        int diagonal = 1 + dfs(r + 1, c + 1, M);
        return dp[r][c] = Math.min(Math.min(down, right), diagonal);
    }
}