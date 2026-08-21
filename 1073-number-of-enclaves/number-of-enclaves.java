class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int one = 0, m = grid.length, n = grid[0].length;
        boolean[][] isVisited = new boolean[m][n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (r == 0 || r == m - 1 || c == 0 || c == n - 1) {
                    if (grid[r][c] == 1){
                        q.add(new int[] { r, c });
                        isVisited[r][c] = true;
                    }
                }

                if (grid[r][c] == 1)
                    one++;
            }
        }
        int connected = q.size();
        int[][] directions = {
                { 1, 0 },
                { 0, 1 },
                { -1, 0 },
                { 0, -1 },
        };
        while (!q.isEmpty()) {
            int[] land = q.poll();
            for (int[] d : directions) {
                int nr = land[0] + d[0];
                int nc = land[1] + d[1];

                if (nr < 0 || nr > m - 1 || nc < 0 || nc > n - 1)
                    continue;

                if (isVisited[nr][nc])
                    continue;

                if (grid[nr][nc] == 1) {
                    q.add(new int[] { nr, nc });
                    connected++;
                }

                isVisited[nr][nc] = true;

            }
        }

        return one - connected;
    }
}