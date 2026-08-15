class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] d : dp)
            Arrays.fill(d, -1);
        return min(0, 0, grid, dp);
    }

    int min(int r, int c, int[][] grid, int[][] dp) {
        if (r == grid.length - 1 && c == grid[0].length - 1)
            return grid[r][c];

        if (r >= grid.length || c >= grid[0].length)
            return Integer.MAX_VALUE;

        if (dp[r][c] != -1)
            return dp[r][c];

        int down = min(r + 1, c, grid, dp);
        int right = min(r, c + 1, grid, dp);
        int sum = Math.min(down, right);
        if (sum == Integer.MAX_VALUE)
            dp[r][c] = Integer.MAX_VALUE;

        return dp[r][c] = grid[r][c] + sum;
    }
}