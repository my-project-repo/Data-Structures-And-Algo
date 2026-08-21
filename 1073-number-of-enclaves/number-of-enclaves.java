class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();

        int one = 0;
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] isVisited = new boolean[m][n];

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {

                if (grid[r][c] == 1) {
                    one++;

                    if (r == 0 || r == m - 1 || c == 0 || c == n - 1) {
                        q.add(new int[] { r, c });
                        isVisited[r][c] = true;
                    }
                }
            }
        }

        int connected = q.size();

        int[][] directions = {
                { 1, 0 },
                { 0, 1 },
                { -1, 0 },
                { 0, -1 }
        };

        while (!q.isEmpty()) {
            int[] land = q.poll();

            for (int[] d : directions) {
                int nr = land[0] + d[0];
                int nc = land[1] + d[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                    continue;

                if (isVisited[nr][nc])
                    continue;

                if (grid[nr][nc] == 1) {
                    q.add(new int[] { nr, nc });
                    isVisited[nr][nc] = true;
                    connected++;
                }
            }
        }

        return one - connected;
    }
}