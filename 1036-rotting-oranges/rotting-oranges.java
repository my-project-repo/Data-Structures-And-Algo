class Solution {
    public int orangesRotting(int[][] grid) {
        // Multi Source BSF
        Queue<int[]> q = new LinkedList<>();
        int[][] dir = {
                { 1, 0 },
                { 0, 1 },
                { -1, 0 },
                { 0, -1 }
        };
        int m = grid.length, n = grid[0].length, count = 0, ans = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 2) {
                    q.add(new int[] { r, c });
                    grid[r][c] = 3;
                } else if (grid[r][c] == 1)
                    count++;
            }
        }

        while (!q.isEmpty() && count > 0) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] val = q.poll();
                int r = val[0];
                int c = val[1];
                for (int[] d : dir) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                        continue;
                    if (grid[nr][nc] != 1)
                        continue;

                    count--;
                    q.add(new int[] { nr, nc });
                    grid[nr][nc] = 2;
                }
            }
            ans++;
        }

        return count == 0 ? ans : -1;
    }
}