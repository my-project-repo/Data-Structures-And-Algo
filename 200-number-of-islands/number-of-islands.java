class Solution {
    public int numIslands(char[][] grid) {
        int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length, n = grid[0].length, ans = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == '1') {
                    q.add(new int[] { r, c });
                    grid[r][c] = '2';
                    ans++;
                }

                while (!q.isEmpty()) {
                    int[] info = q.poll();
                    for (int[] d : directions) {
                        int nr = info[0] + d[0];
                        int nc = info[1] + d[1];

                        if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                            continue;
                        if (grid[nr][nc] == '2')
                            continue;
                        if (grid[nr][nc] == '1')
                            q.add(new int[] { nr, nc });
                        grid[nr][nc] = '2';

                    }
                }
            }
        }

        return ans;
    }
}