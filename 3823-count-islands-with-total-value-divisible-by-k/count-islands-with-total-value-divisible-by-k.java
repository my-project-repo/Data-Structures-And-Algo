class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length, ans = 0;
        int[][] dir = {
                { -1, 0 },
                { 0, -1 },
                { 1, 0 },
                { 0, 1 }
        };
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0)
                    continue;
                queue.add(new int[] { i, j });
                long sum = grid[i][j];
                grid[i][j] = 0;
                while (!queue.isEmpty()) {
                    int[] C = queue.poll();
                    for (int[] d : dir) {
                        int nr = C[0] + d[0];
                        int nc = C[1] + d[1];
                        if (nr >= m || nr < 0 || nc >= n || nc < 0 || grid[nr][nc] == 0)
                            continue;
                        sum += grid[nr][nc];
                        queue.add(new int[] { nr, nc });
                        grid[nr][nc] = 0;
                    }
                }

                if (sum % k == 0)
                    ans++;
            }
        }
        return ans;
    }
}