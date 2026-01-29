class Solution {
    int mini = Integer.MAX_VALUE;

    public int minPathSum(int[][] grid) {
        return min(0, 0, grid.length, grid[0].length, grid, 0, new int[grid.length][grid[0].length]);

    }

    int min(int i, int j, int m, int n, int[][] grid, int sum, int[][] dp) {
        if (i >= m || j >= n)
            return Integer.MAX_VALUE;
        sum += grid[i][j];
        if (i == m - 1 && j == n - 1)
            return sum;
        if (dp[i][j] != 0)
            return sum + dp[i][j];
        int down = min(i + 1, j, m, n, grid, sum, dp);
        int right = min(i, j + 1, m, n, grid, sum, dp);
        int min = Math.min(down, right);
        dp[i][j] = min - sum;
        return min;
    }
}