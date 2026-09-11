class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length , ans = 0;
        int[][] dir = {
                { 0, 1 },
                { 0, -1 },
                { 1, 0 },
                { -1, 0 }
        };
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    q.add(new int[] { i, j });
                    grid[i][j] = '0';
                    while (!q.isEmpty()) {
                        int[] val = q.poll();
                        for (int[] d : dir) {
                            int nr = val[0] + d[0];
                            int nc = val[1] + d[1];
                            if (nr < 0 || nr >= m || nc < 0 || nc >= n || grid[nr][nc] == '0')
                                continue;

                            grid[nr][nc] = '0';
                            q.add(new int[] { nr, nc });
                        }
                    }
                }
            }
        }

        return ans;
    }
}