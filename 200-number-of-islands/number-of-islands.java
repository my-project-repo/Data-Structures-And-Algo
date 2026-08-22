class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int m = grid.length, n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, m, n);
                    ans++;
                }
            }
        }

        return ans;
    }

    private void dfs(char[][] grid, int i, int j, int len, int wid) {
        if (i >= 0 && i < len && j >= 0 && j < wid && grid[i][j] == '1') {
            grid[i][j] = '0';
            dfs(grid, i - 1, j, len, wid);
            dfs(grid, i, j + 1, len, wid);
            dfs(grid, i + 1, j, len, wid);
            dfs(grid, i, j - 1, len, wid);
        }
    }
}